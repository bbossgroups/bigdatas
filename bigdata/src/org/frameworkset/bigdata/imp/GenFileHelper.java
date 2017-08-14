package org.frameworkset.bigdata.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.frameworkset.bigdata.util.DBHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenFileHelper {
	private static Logger log = LoggerFactory.getLogger(GenFileHelper.class); 
	List<Thread> genthreads;
	List<Thread> upthreads;
	AtomicInteger genfilecount;
	AtomicInteger upfilecount;
	ExecutorJob job;
	TaskConfig config;
	public boolean isOnejob() {
		return this.config.isOnejob();
	}
	public boolean genlocalfile()
	{
		return this.config.isGenlocalfile();
	}
	public GenFileHelper(ExecutorJob job) {
		this.job = job;
		this.config = this.job.config;
		this.genfilecount = job.genfilecount;
		this.upfilecount= job.upfilecount;
	}
	
	public boolean isforceStop()
	{
		return this.job.jobStatic.isforceStop();
	}
	public int getGenquequetimewait() {
		return config.getGenquequetimewait();
	}
	 
	public int getUploadqueuetimewait() {
		return config.getUploadqueuetimewait();
	}
	public void countdownupfilecount() {
		this.upfilecount.decrementAndGet();
	}

	public void countdowngenfilecount() {
		this.genfilecount.decrementAndGet();
	}

	public void join() {
		for (int i = 0; i < genthreads.size(); i ++)
		{
			Thread thread = genthreads.get(i);
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(config.isGenlocalfile())
		{
			for (int i = 0; i< upthreads.size(); i ++)
			{
				Thread thread = upthreads.get(i);
				try {
					thread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 追加工作线程
	 * @param threadNums 追加工作线程数
	 */
	public void addGenThread(int threadNums)
	{
		if(!this.job.jobStatic.canappendworkthread())
			return;
		int tsize = this.genthreads.size();
		if(this.job.config.isUsepool())
		{
			DBHelper.increamentMaxTotalConnections(this.getDBName(), threadNums);
		}
		for(int i = 0; i < threadNums; i ++)
		{
			addWorkthread(tsize+ i);
		}
	}
	
	private void addWorkthread(int i)
	{
		GenFileWork gw = new GenFileWork(this, genfilecount,
				job.getGenfileQueues(), job.getUpfileQueues(), null);
		log.info("start task handle thread["+config.filebasename+"-"+i+"]");
		Thread thread = new Thread(gw,config.filebasename+"-"+i);
		genthreads.add(thread);
		thread.start();
	}
	public void run(TaskConfig config) {
//		CyclicBarrier barrier = new CyclicBarrier(config.getGeneworkthreads());
//		genfilecount = new AtomicInteger(config.getTasks().length);

		genthreads = new ArrayList<Thread>(config.getGeneworkthreads());
		for (int i = 0; i < config.getGeneworkthreads(); i++) {
//			GenFileWork gw = new GenFileWork(this, genfilecount,
//					job.getGenfileQueues(), job.getUpfileQueues(), null);
//			log.info("start task handle thread["+config.filebasename+"-"+i+"]");
//			Thread thread = new Thread(gw,config.filebasename+"-"+i);
//			genthreads.add(thread);
//			thread.start();
			 addWorkthread(i);
		}

		if(config.isGenlocalfile())
		{	
			 
	//		CyclicBarrier upbarrier = new CyclicBarrier(works);
			upthreads = new ArrayList<Thread>(config.getUploadeworkthreads());
			for (int i = 0; i < config.getUploadeworkthreads(); i++) {
				Thread thread = new Thread(new UploadWorker(this,
						job.getFileSystem(), upfilecount, job.getUpfileQueues(),
						null));
				upthreads.add(thread);
				thread.start();
			}
		}

	}
	public String getDBName() {
		// TODO Auto-generated method stub
		return this.config.getDbname();
	}
	public String getQuerystatement() {
		// TODO Auto-generated method stub
		return this.config.getQuerystatement();
	}
	public FileSegment createSingleFileSegment(int fileNo, long startid) {
		// TODO Auto-generated method stub
		return this.job.createSingleFileSegment(fileNo, startid);
	}

}