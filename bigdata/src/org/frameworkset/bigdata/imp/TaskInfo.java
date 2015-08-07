package org.frameworkset.bigdata.imp;


public class TaskInfo  implements java.io.Serializable{
	Object startoffset;
	Object endoffset;
	
	Object startid;
	Object endid;
	long pagesize;
	private String subpartition;
	private boolean issubpartition;
	String partitionName;
	String filename;
	/**
	 * 如果任务被重新分配，则忽略处理
	 */
	transient boolean reassigned;
	/**
	 * 任务号
	 */
	String taskNo;
	
	public Object getStartoffset() {
		return startoffset;
	}
	public void setStartoffset(Object startoffset) {
		this.startoffset = startoffset;
	}
	public Object getEndoffset() {
		return endoffset;
	}
	public void setEndoffset(Object endoffset) {
		this.endoffset = endoffset;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getPagesize() {
		return pagesize;
	}
	public void setPagesize(long pagesize) {
		this.pagesize = pagesize;
	}
	public String toString()
	 {
		
		 StringBuilder builder = new StringBuilder();
		 builder.append("taskNo=").append(taskNo).append(",").append("filename=").append(filename).append(",")
			.append("pagesize=").append(pagesize).append(",").append("subpartition=").append(subpartition).append(",").append("parentpartition=").append(partitionName).append(",")
			.append("startoffset=").append(startoffset).append(",")
			.append("endoffset=").append(endoffset);
		 return builder.toString();
	 }
	public String getTaskNo() {
		return taskNo;
	}
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	public boolean isReassigned() {
		return reassigned;
	}
	public void setReassigned(boolean reassigned) {
		this.reassigned = reassigned;
	}
	public String getPartitionName() {
		return partitionName;
	}
	public void setPartitionName(String partitionName) {
		this.partitionName = partitionName;
	}
	public String getSubpartition() {
		return subpartition;
	}
	public void setSubpartition(String subpartition) {
		this.subpartition = subpartition;
	}
	public boolean isIssubpartition() {
		return issubpartition;
	}
	public void setIssubpartition(boolean issubpartition) {
		this.issubpartition = issubpartition;
	}
	

}
