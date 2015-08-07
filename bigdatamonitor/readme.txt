to do list:
1.可以直接将服务器上的文件上传到hdfs


  <property name="old1_sany_qzj_exception_info" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcx/exception/now"
		 
		filebasename="old1_sany_qzj_exception_info"
		schema="QZJIEM"  		 
	  tablename="old1_sany_qzj_exception_info"	 
	    usepartition="true"	  
	   
	   pkname="GKID"
		datatype="text" />	
		
		
		
  <property name="old2_sany_qzj_hugecrane_static" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcd/now/"
		 
		filebasename="old2_sany_qzj_hugecrane_static"
		schema="QZJIEM"  		 
	  tablename="OLD2_SANY_QZJ_HUGECRANE_STATIC"	 
	    usepartition="true"	  
	    single="true"
	   target="csxbpmts02v-ap-971"	   
	   pkname="ID"
		datatype="text" />			
		
  <property name="old_sany_qzj_result" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcx/result/old"
		 
		filebasename="old_sany_qzj_result"
		schema="QZJIEM"  		 
	  tablename="OLD_SANY_QZJ_RESULT"	 
	    usepartition="true"	   
	   pkname="GKID"
		datatype="text" />	
		
		
<property name="old_sany_qzj_result" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcx/result/old"
		 
		filebasename="old_sany_qzj_result"
		schema="QZJIEM"  		 
	  tablename="OLD_SANY_QZJ_RESULT"	 
	    usepartition="true"	
	    blocks="12,2,3,10,20,16,14,15,11,6,4,21,8,1,9,19,18,13,7,5,17"   
	   pkname="GKID"
		datatype="text" />			