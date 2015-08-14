package org.frameworkset.bigdata.imp;

import org.frameworkset.bigdata.imp.monitor.JobStatic;

import com.frameworkset.util.SimpleStringUtil;

/**
 * <property name="addworkerthreads" addworkthreads="csxDBts01v-ap-19045:3,csxDBts01v-ap-912:3" adjustJobname="hx20111212_20120331"/>
 * @author yinbp
 *
 */
public class AddWorkthreadsJob {

	public AddWorkthreadsJob() {
		// TODO Auto-generated constructor stub
	}
	public void execute(AddWorkthreads addWorkthreads,Integer nums)
	{
		 JobStatic jobStatic = Imp.getImpStaticManager().addAddWorkthreadsJobStatic(addWorkthreads);
		
		 StringBuilder builder = new StringBuilder();
		
		 
		try {
			ExecutorJob executorJob = Imp.getImpStaticManager().getExecutorJob(addWorkthreads.getAdjustJobname());
			if(executorJob == null)
			{
				jobStatic.setErrormsg("作业["+addWorkthreads.getAdjustJobname()+"]未执行，忽略添加"+nums+"个任务处理线程操作.");
			}
			else
			{
				executorJob.addWorkThread(nums.intValue());
				jobStatic.setErrormsg("为作业["+addWorkthreads.getAdjustJobname()+"]添加"+nums+"个任务处理线程成功.");
			}
		} catch (Exception e) {
			builder.append("添加作业[").append(addWorkthreads.getAdjustJobname()).append("]任务工作处理线程失败:")
					.append(addWorkthreads.toString()).append("\r\n").append(SimpleStringUtil.exceptionToString(e)).append("\r\n");
		}
		 
		 jobStatic.setEndTime(System.currentTimeMillis());
		 jobStatic.setStatus(1);
		 if(builder.length() > 0)
		 {
			 jobStatic.setErrormsg(builder.toString());
			
		 }
		 
	}
}
