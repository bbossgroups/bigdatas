to do list:
1.可以直接将服务器上的文件上传到hdfs


  <property name="old1_s_qzj_exception_info" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcx/exception/now"
		 
		filebasename="old1_s_qzj_exception_info"
		schema="QZJIEM"  		 
	  tablename="old1_s_qzj_exception_info"
	    usepartition="true"	  
	   
	   pkname="GKID"
		datatype="text" />	
		
		
		
  <property name="old2_s_qzj_hugecrane_static" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcd/now/"
		 
		filebasename="old2_s_qzj_hugecrane_static"
		schema="QZJIEM"  		 
	  tablename="OLD2_s_QZJ_HUGECRANE_STATIC"
	    usepartition="true"	  
	    single="true"
	   target="csxbpmts02v-ap-971"	   
	   pkname="ID"
		datatype="text" />			
		
  <property name="old_s_qzj_result" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcx/result/old"
		 
		filebasename="old_s_qzj_result"
		schema="QZJIEM"  		 
	  tablename="OLD_s_QZJ_RESULT"
	    usepartition="true"	   
	   pkname="GKID"
		datatype="text" />	
		
		
<property name="old_s_qzj_result" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/qcx/result/old"
		 
		filebasename="old_s_qzj_result"
		schema="QZJIEM"  		 
	  tablename="OLD_s_QZJ_RESULT"
	    usepartition="true"	
	    blocks="12,2,3,10,20,16,14,15,11,6,4,21,8,1,9,19,18,13,7,5,17"   
	   pkname="GKID"
		datatype="text" />			
		

<property name="old_s_qzj_result" dbname="qzj13"
		driver="oracle.jdbc.driver.OracleDriver" dburl="jdbc:oracle:thin:@//10.16.1.13:1521/qzjiem"
		dbuser="QZJIEM" dbpassword="qzjiem#EDC2011" validatesql="select 1 from dual"
		usepool="false" hdfsserver="hdfs://10.0.15.40:9000" hdfsdatadir="/m2m/data05/test"
		 
		filebasename="old_s_qzj_result"
		schema="QZJIEM"  		 
	  tablename="OLD_s_QZJ_RESULT"
	    usepartition="true"	
	  datablocks="10"
	   pkname="GKID"
		datatype="text" />		
		

ALTER TABLE OLD_s_QZJ_RESULT
 DROP PRIMARY KEY CASCADE;
DROP TABLE OLD_s_QZJ_RESULT CASCADE CONSTRAINTS PURGE;

CREATE TABLE OLD_s_QZJ_RESULT
(
  GKID                  NUMBER  NOT NULL,
  VECHILENO             VARCHAR2(20 BYTE),
  QS02                  NUMBER,
  QS03                  NUMBER,
  QL04                  NUMBER,
  QB05                  NUMBER,
  QB06                  NUMBER,
  QJ07                  NUMBER,
  QE08                  NUMBER,
  QS09                  NUMBER,
  QG10                  NUMBER,
  QB11                  NUMBER,
  QB12                  NUMBER,
  QC13                  NUMBER,
  QC14                  NUMBER,
  QQ15                  NUMBER,
  QC16                  NUMBER,
  QC17                  NUMBER,
  QQ18                  NUMBER,
  QS19                  NUMBER,
  QG20                  NUMBER,
  QG22                  DATE,
  QC23                  NUMBER,
  QC24                  NUMBER,
  QC25                  DATE,
  QX26                  NUMBER,
  QX27                  NUMBER,
  DT                    DATE,
  QG21                  NUMBER,
  QQ28                  NUMBER,
  QC29                  NUMBER,
  QC30                  NUMBER,
  QQ31                  NUMBER,
  QS32                  NUMBER,
  QS01                  DATE                    DEFAULT sysdate,
  GPSID                 VARCHAR2(10 BYTE),
  QX00                  NUMBER,
  ENGINE_SPEED          NUMBER,
  ROOTLET_STATE_1       NUMBER,
  ROOTLET_STATE_2       NUMBER,
  ROOTLET_STATE_3       NUMBER,
  ROOTLET_STATE_4       NUMBER,
  ROOTLET_STATE_5       NUMBER,
  ROOTLET_PRE_1         NUMBER,
  ROOTLET_PRE_2         NUMBER,
  ROOTLET_PRE_3         NUMBER,
  ROOTLET_PRE_4         NUMBER,
  ROOTLET_PRE_5         NUMBER,
  ROTATE_ANGLE          NUMBER,
  HORIZON_DIAL          NUMBER,
  LOAD_SPEED_GEAR       NUMBER,
  VEHICLE_SPEED         NUMBER,
  OIL_PER_HOUR          NUMBER,
  OIL_PER_HUNDRED       NUMBER,
  WATER_TEMP            NUMBER,
  SLACK_SPEED           NUMBER,
  OIL_PRESS             NUMBER,
  OILBOX_POS            NUMBER,
  OVERLOAD_BTN          NUMBER,
  OVERLOAD_BTN_TIME     NUMBER,
  MILEAGE               NUMBER,
  ENGINE_WORK_HOURS     NUMBER,
  HEIGHT_LIM_INFO       NUMBER,
  EXPAND_LIM_INFO       NUMBER,
  HORIZON_DIAL_Y        NUMBER,
  UP_OIL_DOOR           NUMBER,
  LENGTH_AD             NUMBER,
  ANGLE_AD              NUMBER,
  OVERLOAD_RELEASE_BTN  NUMBER,
  GK_VERSION            NUMBER,
  LOCK_STATE_SERIALNO   NUMBER,
  DT_SECOND_PACKET      DATE,
  TOTALWORKTIME         NUMBER,
  INORLEAVEFACTORY      NVARCHAR2(10),
  TEMP                  NUMBER                  DEFAULT 0,
  OILPOSITION           NUMBER,
  OILTANK               NUMBER
)
PARTITION BY RANGE (DT) 
(  
  PARTITION TP_s_QZJ_RESULT_201110 VALUES LESS THAN (TO_DATE(' 2011-11-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201111 VALUES LESS THAN (TO_DATE(' 2011-12-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201112 VALUES LESS THAN (TO_DATE(' 2012-01-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201201 VALUES LESS THAN (TO_DATE(' 2012-02-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201202 VALUES LESS THAN (TO_DATE(' 2012-03-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201203 VALUES LESS THAN (TO_DATE(' 2012-04-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201204 VALUES LESS THAN (TO_DATE(' 2012-05-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201205 VALUES LESS THAN (TO_DATE(' 2012-06-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201206 VALUES LESS THAN (TO_DATE(' 2012-07-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201207 VALUES LESS THAN (TO_DATE(' 2012-08-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201208 VALUES LESS THAN (TO_DATE(' 2012-09-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201209 VALUES LESS THAN (TO_DATE(' 2012-10-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201210 VALUES LESS THAN (TO_DATE(' 2012-11-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201211 VALUES LESS THAN (TO_DATE(' 2012-12-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201301 VALUES LESS THAN (TO_DATE(' 2013-02-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201302 VALUES LESS THAN (TO_DATE(' 2013-03-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201303 VALUES LESS THAN (TO_DATE(' 2013-04-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201304 VALUES LESS THAN (TO_DATE(' 2013-05-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201305 VALUES LESS THAN (TO_DATE(' 2013-06-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201306 VALUES LESS THAN (TO_DATE(' 2013-07-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201307 VALUES LESS THAN (TO_DATE(' 2013-08-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201308 VALUES LESS THAN (TO_DATE(' 2013-09-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201309 VALUES LESS THAN (TO_DATE(' 2013-10-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201310 VALUES LESS THAN (TO_DATE(' 2013-11-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201311 VALUES LESS THAN (TO_DATE(' 2013-12-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN')),
  PARTITION TP_s_QZJ_RESULT_201312 VALUES LESS THAN (TO_DATE(' 2014-01-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS', 'NLS_CALENDAR=GREGORIAN'))
);

COMMENT ON COLUMN OLD_s_QZJ_RESULT.VECHILENO IS '设备编号';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QS02 IS '锁机状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QS03 IS '工作状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QL04 IS '力矩百分比';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QB05 IS '倍率';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QB06 IS '臂长';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QJ07 IS '角度';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QE08 IS '额定重量';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QS09 IS '实际重量';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QG10 IS '工作幅度';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QB11 IS '变幅油缸大腔压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QB12 IS '变幅油缸小腔压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QC13 IS '超载力矩百分比';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QC14 IS '持续时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QQ15 IS '保留';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QC16 IS '保留';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QC17 IS '保留';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QQ18 IS '保留';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QS19 IS '保留';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QG20 IS '故障类型标志';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.DT IS '数据入库时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QQ28 IS '起重机总的工作时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QC29 IS '超载次数';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QC30 IS '超载最大力矩百分比';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QQ31 IS '起重机状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QS32 IS '锁机状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QS01 IS '时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.GPSID IS 'GPS编号';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.QX00 IS '信息类型:1 实时工况
2 统计信息
3 异常工况 
4参数信息
5故障信息
';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ENGINE_SPEED IS '实时工况和异常工况：发动机转速';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_STATE_1 IS '实时工况和异常工况：一号支腿状态0：支腿没伸  1：支腿半伸 2：支腿全伸(1表示伸半升，2表示缩半升，3表示全升，10表示未知)';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_STATE_2 IS '实时工况和异常工况：二号支腿状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_STATE_3 IS '实时工况和异常工况：三号支腿状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_STATE_4 IS '实时工况和异常工况：四号支腿状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_STATE_5 IS '实时工况和异常工况：五号支腿状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_PRE_1 IS '实时工况和异常工况：一号支腿压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_PRE_2 IS '实时工况和异常工况：二号支腿压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_PRE_3 IS '实时工况和异常工况：三号支腿压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_PRE_4 IS '实时工况和异常工况：四号支腿压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROOTLET_PRE_5 IS '实时工况和异常工况：五号支腿压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ROTATE_ANGLE IS '实时工况和异常工况：转台角度';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.HORIZON_DIAL IS '实时工况和异常工况：整车水平度';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.LOAD_SPEED_GEAR IS '实时工况和异常工况：起吊速度档位(不使用，其为上车油门位置)';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.VEHICLE_SPEED IS '实时工况：车速';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OIL_PER_HOUR IS '实时工况：每小时油耗(改为总油耗)';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OIL_PER_HUNDRED IS '实时工况：百公里油耗，平均燃油经济效益';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.WATER_TEMP IS '实时工况：水温';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.SLACK_SPEED IS '实时工况：怠速转速';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OIL_PRESS IS '实时工况：机油压力';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OILBOX_POS IS '实时工况：油箱油位';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OVERLOAD_BTN IS '实时工况：超载解除按钮状态';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OVERLOAD_BTN_TIME IS '实时工况：超载解除持续时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.MILEAGE IS '实时工况和统计信息：里程数';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ENGINE_WORK_HOURS IS '实时工况和统计信息：发动机总的工作时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.HEIGHT_LIM_INFO IS '实时工况：高度限位信息';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.EXPAND_LIM_INFO IS '实时工况：过放信息';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.HORIZON_DIAL_Y IS '实时工况和异常工况：整车水平度y轴';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.UP_OIL_DOOR IS '实时工况和异常工况：上车油门位置';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.LENGTH_AD IS '异常工况：长度AD';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.ANGLE_AD IS '异常工况：角度AD';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.OVERLOAD_RELEASE_BTN IS '实时工况：超载解除开关';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.GK_VERSION IS '实时工况、异常工况和统计信息：工况版本号';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.LOCK_STATE_SERIALNO IS '实时工况:锁机-解锁标示序号';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.DT_SECOND_PACKET IS '实时工况:第二包时间';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.TOTALWORKTIME IS '总工作时间(20090505pengtao添加)';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.INORLEAVEFACTORY IS '设备出厂状态：厂内调试、已入库、已出厂';

COMMENT ON COLUMN OLD_s_QZJ_RESULT.TEMP IS '起重机总工作时间偏差量';


CREATE UNIQUE INDEX gkididx ON OLD_s_QZJ_RESULT
(GKID);


CREATE INDEX dtvidx ON OLD_s_QZJ_RESULT
(VECHILENO, DT);


CREATE INDEX qsvidx ON OLD_s_QZJ_RESULT
(VECHILENO, QS01);


ALTER TABLE OLD_s_QZJ_RESULT ADD (
 
 PRIMARY KEY
 (GKID));


			
		