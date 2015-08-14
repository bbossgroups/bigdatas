package org.frameworkset.bigdata.imp;

import java.util.Map;

public class AddWorkthreads implements java.io.Serializable{
	private String jobstaticid;
	private String jobname;
	private String addworkthreads;
	private String adjustJobname;
	private Map<String,Integer> serverWorkthreadnums;
	public AddWorkthreads() {
		// TODO Auto-generated constructor stub
	}
	public String getJobstaticid() {
		return jobstaticid;
	}
	public void setJobstaticid(String jobstaticid) {
		this.jobstaticid = jobstaticid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getAddworkthreads() {
		return addworkthreads;
	}
	public void setAddworkthreads(String addworkthreads) {
		this.addworkthreads = addworkthreads;
	}
	public String getAdjustJobname() {
		return adjustJobname;
	}
	public void setAdjustJobname(String adjustJobname) {
		this.adjustJobname = adjustJobname;
	}
	
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("jobname=").append(this.jobname)
		.append(",addworkthreads=").append(this.addworkthreads)
		.append(",adjustJobname=").append(this.adjustJobname)
		.append(",jobstaticid=").append(this.jobstaticid);
		return builder.toString();
	}
	public Map<String, Integer> getServerWorkthreadnums() {
		return serverWorkthreadnums;
	}
	public void setServerWorkthreadnums(Map<String, Integer> serverWorkthreadnums) {
		this.serverWorkthreadnums = serverWorkthreadnums;
	}

}
