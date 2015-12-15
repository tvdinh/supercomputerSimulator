package com.tdinh.academic.supercomputerSimulator.event;

import com.tdinh.academic.supercomputerSimulator.model.Job;

/**
 * Class <tt>Event</tt> describes an event that can occurs
 * in the supercomputer system. See {@link EventType} for 
 * event types.
 *  
 * @author tuan
 *
 */
public class Event implements Comparable<Event> {
	
	private EventType type;
	protected double time;
	protected Job job;
	
	public Event(EventType type, Job j, double t) {
		this.type = type;
		this.job  = j;
		this.time = t;
	}
	
	/**
	 * Setters
	 */
	public void setJob(Job j) {this.job = j;}
	
	/**
	 * Getters
	 */
	public double getTime() 	{return this.time;}
	public EventType getType()  {return this.type;}
	public Job getJob()			{return this.job;}
	
	/**
	 * Invoked to handle the event
	 */
	public void handler() {}
	
	/**
	 * return String a string presentation of the event
	 */
	public String toString() {
		return "An event scheduled to run at " + this.time;
	}

	/**
	 * Compare event based on time-stamp 
	 * @param e
	 * @return
	 */
	public int compareTo(Event e) {
		if (this.time < e.getTime()) return -1;
		else if (this.time > e.getTime()) return 1;
		else return 0;
	}
}
