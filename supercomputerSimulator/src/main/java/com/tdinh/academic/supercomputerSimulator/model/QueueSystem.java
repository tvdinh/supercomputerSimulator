package com.tdinh.academic.supercomputerSimulator.model;

/**
 * Class <tt>QueueSystem</tt> presents the queue system in
 * a supercomputer cluster that is responsible to handle coming jobs
 * assign resources to jobs and manage server pools
 * <br>
 * Each <tt>QueueSystem</tt> comprises of a number of <tt>ServerPool<tt>
 * {@link ServerPool} and each one has its own <tt>JobQueue</tt> 
 * {@link JobQueue}}.
 *  
 * @author tuan
 *
 */
public class QueueSystem {

	private final int numPool;
	
	private ServerPool [] serverPools;
	private JobQueue   [] jobQueues; 
	
	public QueueSystem(ServerPool [] sp, JobQueue [] jq) {
		if (sp.length != jq.length) throw new AssertionError();
		numPool = sp.length;
		this.serverPools = sp;
		this.jobQueues   = jq;
	}
	
	/**
	 * 
	 * @param deltat
	 */
	public void systemUpdate(double deltat) {
		
	}
	
	/**
	 * 
	 */
	public void arrivalJobHandler(Job j) {
		
	}
	
	/**
	 * 
	 */
	public void departureJobHandler() {
		
	}
}
