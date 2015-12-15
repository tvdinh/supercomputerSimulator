package com.tdinh.academic.supercomputerSimulator.model;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.apache.log4j.Logger;

import com.tdinh.academic.supercomputerSimulator.EventSchedulerTest;

/**
 * Class <tt>JobQueue</tt> presents a job queue in the super-computing
 * system  
 * @author tuan
 *
 */
public class JobQueue {

	private final static int CAPACITY = 1 << 7;  // 256
	
	private static Logger logger = Logger.getLogger(JobQueue.class);

	/**
	 * 	There is a non-trivial policy then defines 
	 *  how job is dispatched from job queues.
	 *  Here, by using Queue data structure from java.util.Queue
	 *  it is assumed the policy is simply FIFO.
	 *  
	 *  In reality however, it is influenced by job's author
	 *  state of the system, the requested resources, etc.	 
	 */
	private Queue<Job> q;
	
	private int cap;
	
	public JobQueue(int cap) {
		this.cap   = cap; 
		this.q     = new ArrayBlockingQueue<Job>(cap);
	}
	
	/**
	 * 
	 */
	public JobQueue() {
		this(CAPACITY);
	}
	
	/**
	 * Reset job queue capacity
	 * @param cap
	 */
	public void setCapacity(int cap) {
		this.cap = cap;
	}
	
	
	/**
	 * Add a job to the job queue
	 * @param j
	 */
	public boolean addJob(Job j) {
		try {
			return q.add(j);
		} catch (IllegalStateException ex) {
			logger.debug("Failed to add job, job queue is full");
			return false;
		}
	}
	
	/**
	 * 
	 * @return the job at head of the queue (FIFO policy)
	 */
	public Job nextExecute() {
		return q.poll();
	}
	
	/**
	 * 
	 * @return current size of the queue
	 */
	public int getSize() {
		return q.size();
	}
	
	/**
	 * 
	 * @return queue capacity
	 */
	public int getCapacity() {
		return cap;
	}
	
	/**
	 * 
	 * @return whether the queue is empty
	 */
	public boolean isEmpty() {
		return q.isEmpty();
	}
	
	public boolean isFull() {
		return (q.size() == cap);
	}
	
	/**
	 * A string presentation of the job queue
	 */
	public String toString() {
		return "Job Queue with capacity: " + cap + " , current number of job:" + q.size();
	}
}
