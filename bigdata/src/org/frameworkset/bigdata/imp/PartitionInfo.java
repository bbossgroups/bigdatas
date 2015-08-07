package org.frameworkset.bigdata.imp;

public class PartitionInfo implements java.io.Serializable{
	private String partition;
	private String subpartition;
	private boolean issubpartition;
	public PartitionInfo() {
		// TODO Auto-generated constructor stub
	}
	public String getPartition() {
		return partition;
	}
	public void setPartition(String partition) {
		this.partition = partition;
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
	
	public String evalsqlpart()
	{
		if(!this.issubpartition)
		{
			return  " PARTITION  ("+partition+")";
		}
		else
		{
			return  " SUBPARTITION  ("+subpartition+")";
		}
	}
	public String evalsqlpart(String statement)
	{
		if(!isIssubpartition())
			 return statement.replace("#{partition}", " PARTITION  ("+getPartition()+")");
		 else
			 return statement.replace("#{partition}", " SUBPARTITION  ("+getSubpartition()+")");
	}

}
