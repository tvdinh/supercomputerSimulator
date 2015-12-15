package com.tdinh.academic.supercomputerSimulator.model;

/**
 * Class <tt>Job</tt> presents a job in the super-computing system
 * @author tuan
 *
 */
public class Job {

	private final int id;
	private String user;
	private String group;
	
	private double estRuntime;
	private double runtime;
	
	private int reqServer;
	private int reqMemory; //MB
	
	public Job(int id) {
		this.id = id;
	}
	
	/**
	 * Setters
	 */
	public void setUser(String u)  		  { this.user       = u;}
	public void setGroup(String g) 		  { this.group      = g;}
	public void setEstRuntime(double ert) { this.estRuntime = ert;}
	public void setRuntime(double rt)     { this.runtime    = rt;}
	public void setReqServer(int rs )	  { this.reqServer  = rs;}
	public void setReqMemory(int rm)	  { this.reqMemory  = rm;}
	
	/**
	 * Getters
	 */
	
	public String getUser()  		  	  { return this.user;}
	public String getGroup() 		  	  { return this.group;}
	public double getEstRuntime()     	  { return this.estRuntime;}
	public double getRuntime()        	  { return this.runtime;}
	public int    getReqServer()	      { return this.reqServer;}
	public int    getReqMemory()	      { return this.reqMemory;}
	
	public static class Builder {
		private final int id;
		private String user;
		private String group;
		
		private double estRuntime;
		private double runtime;
		
		private int reqServer;
		private int reqMemory; //MB
		
		public Builder(int id) {
			this.id = id;
		}
		
		public Builder user(String val) {
			this.user = val;
			return this;
		}
		
		public Builder group(String val) {
			this.group = val;
			return this;
		}

		public Builder estRuntime(double val) {
			this.estRuntime = val;
			return this;
		}
		
		public Builder runtime(double val) {
			this.runtime = val;
			return this;
		}
		
		public Builder reqServer(int val) {
			this.reqServer = val;
			return this;
		}
		
		public Builder reqMemory(int val) {
			this.reqMemory = val;
			return this;
		}
		
		public Job build() {
			return new Job(this);
		}

	}
	
	private Job(Builder b) {
		this.id 		= b.id;
		this.user 		= b.user;
		this.group		= b.group;
		this.estRuntime = b.estRuntime;
		this.runtime    = b.runtime;
		this.reqServer  = b.reqServer;
		this.reqMemory  = b.reqMemory;
	}
}
