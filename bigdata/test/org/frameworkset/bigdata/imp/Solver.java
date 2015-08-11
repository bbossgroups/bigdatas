package org.frameworkset.bigdata.imp;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import com.frameworkset.common.poolman.SQLExecutor;
import com.frameworkset.common.poolman.util.SQLUtil;

public class Solver {
	int N;
	float[][] data;
	CyclicBarrier barrier;
	
	

	

	class Worker implements Runnable {
		int myRow;
		boolean done;
		int count = 0;
		Worker(int row) {
			myRow = row;
		}
		boolean done() {
			return done;
		}
		void processRow(int row) {
			System.out.print("row:"+row);
			count ++;
			if(count == 3)
				done = true;
		}
		public void run() {
			while (!done()) {
				processRow(myRow);

				try {
					barrier.await();
				} catch (InterruptedException ex) {
					return;
				} catch (BrokenBarrierException ex) {
					return;
				}
			}
		}

		

		
	}
	private void mergeRows() {
		System.out.println("mergeRows");
	}
	public void solver(float[][] matrix) {
		data = matrix;
		N = matrix.length;
		Runnable barrierAction = new Runnable() {
			public void run() {
				mergeRows();
			}
		};
		barrier = new CyclicBarrier(N, barrierAction);

		List<Thread> threads = new ArrayList<Thread>(N);
		for (int i = 0; i < N; i++) {
			Thread thread = new Thread(new Worker(i));
			threads.add(thread);
			thread.start();
		}

		// wait until done
		for (Thread thread : threads)
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args) throws SQLException, Exception
	{
////		Solver s = new Solver();
////		s.solver(new float[][]{{1,2,},{3,4}});
//		System.out.println(10000001%3);
//		System.out.println(10000001/3);
//		
//		System.out.println(3333333*3+2);
//		for(int i = 0; i < 1000;i ++)
//		{
//			if(i%2 == 0)
//				SQLExecutor.insertWithDBName("test","INSERT INTO TESTBIGDATA (TID, NAME, SEX) VALUES ( ?, ?,? )", i,"name"+1,"男");
//			else
//				SQLExecutor.insertWithDBName("test","INSERT INTO TESTBIGDATA (TID, NAME, SEX) VALUES ( ?, ?,? )", i,"name"+1,"女");
//		}
		
//		SQLUtil.startPool("test","oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem","QZJIEM","qzjiem#EDC2011",
//				 "true",
//				 null,//"READ_COMMITTED",
//				"select 1 from dual",
//				 "jndi-test",   
//				 2,
//				 2,
//				 2,
//	        		false,
//	        		false,
//	        		null        ,true,false
//	        		);
////		String t = "size:aaaa";
////		System.out.println(t.substring(5));
//		SQLExecutor.queryWithDBNameByNullRowHandler(new ResultSetNullRowHandler(){
//			
//		@Override
//		public void handleRow(ResultSet row) throws Exception {
//			 
//			try {
//				row.getString("SPEED");
//				System.out.println("getString:"+row.getString("SPEED"));
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				
//				System.out.println("Object:"+row.getObject("SPEED"));
//				System.out.println("double:"+row.getDouble("SPEED"));
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 
//		}
//		
//	}, "test", "select * from GPS_RESULT partition(TP_GPS_RESULT_201502) where gpsid='31906913' and GPID=2398426075");
//		double dd = 1.30020034599143E-115;
//		System.out.println(oracle.sql.NUMBER.toText(dd));
		
		System.out.println("sub:test".substring("sub:".length()));
		
		
		SQLUtil.startPool("test","oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@//10.0.15.51:1521/orcl","testpdp1","testpdp1",
		 "true",
		 null,//"READ_COMMITTED",
		"select 1 from dual",
		 "jndi-test",   
		 2,
		 2,
		 2,
   		false,
   		false,
   		null        ,true,false
   		);
		java.text.SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
		Timestamp startdate = new Timestamp(format.parse("2011-10-01 00:00:00").getTime());  
		format = new SimpleDateFormat("yyyy_MM_dd") ;
		for(int i = 0; i < 27; i ++)
		{
			
			String partname ="part"+ format.format(startdate);
			System.out.println("startdate:"+startdate);
			test(partname,startdate,i);
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(startdate);
			c.add(Calendar.MONTH, 1);
			startdate = new Timestamp(c.getTimeInMillis());
			
		}
	}
	
	static void test(String partname,Timestamp date,int count) throws SQLException
	{
		int start = count * 300;
		
		for(int i = 0; i < 300; i ++)
		{
			if((i % 10) == 0 && i > 0)
			{
				java.util.Calendar c = java.util.Calendar.getInstance();
				c.setTime(date);
				c.add(Calendar.DAY_OF_MONTH, 1);
				date = new Timestamp(c.getTimeInMillis());
				System.out.println(date);
				SQLExecutor.insertWithDBName("test", "insert into OLD_SANY_QZJ_RESULT(GKID,VECHILENO,DT) values(?,?,?)",start + i,partname+i, date);
			}
			else
			{
				SQLExecutor.insertWithDBName("test", "insert into OLD_SANY_QZJ_RESULT(GKID,VECHILENO,DT) values(?,?,?)",start + i,partname+i, date);
			}
				
		}
	}
}
