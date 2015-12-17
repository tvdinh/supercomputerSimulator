package com.tdinh.academic.supercomputerSimulator.model;

import com.tdinh.academic.supercomputerSimulator.util.Parameter;

/**
 * Class <tt>ServerPool</tt> presents a server pool in a
 * supercomputer cluster. A <tt> ServerPool </tt> is a
 * virtual group set by the administrator for the purpose
 * of executing policies of resource allocation and
 * management
 * <br>
 * Each <tt>ServerPool</tt> has different pool size, priority
 * etc.
 *  
 * @author tuan
 *
 */
public class ServerPool {
	
	private static final int SERVER_POOL_MAX_CAPACITY = Parameter.SERVER_POOL_MAX_CAPACITY;
	private int capacity;

	private Server [] pool;
	
	public ServerPool(int cap) {
		if ( cap >= SERVER_POOL_MAX_CAPACITY) throw new AssertionError();
		this.capacity = cap;
		pool = new Server[cap];
		//Initialize all servers
		for (int i = 0; i < pool.length; i++ ) {
			pool[i] = new Server();
		}
	}
	
	/**
	 * O(n)
	 * @return true if all servers are not in IDLE state
	 */
	public boolean isFull() {
		for (int i = 0; i < pool.length; i++) 
			if (pool[i].isIdle()) return false;
		return true;
	}
	
	/**
	 * 
	 * @return pool's capacity
	 */
	public int getCapacity() { return this.capacity;}

	/**
	 * O(n)
	 * @return number of available servers (in IDLE state) 
	 */
	public int numIdle() {
		int count = 0;
		for (int i = 0; i < pool.length; i++) 
			if (pool[i].isIdle()) count++;
		return count;
	}
	
	/**
	 * O(n)
	 * @param t
	 */
	public void refresh(double deltat) {
		for (int i = 0; i < pool.length; i++) 
			pool[i].refresh(deltat);
	}
	
	/**
	 * Handle a job that is dispatched to this pool
	 * @param j
	 * @return
	 */
	public boolean jobHandler(Job j) {
		assertionCheck(j);
		//TODO
		return true;
	}
	
	/**
	 * Collection of sanity checks
	 */
	private void assertionCheck(Job j) {
		//Must have enough server to server job
		if (this.numIdle() < j.getReqServer()) 
			throw new AssertionError();
	}

}
