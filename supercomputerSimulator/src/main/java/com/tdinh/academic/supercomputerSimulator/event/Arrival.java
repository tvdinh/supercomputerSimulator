package com.tdinh.academic.supercomputerSimulator.event;

import com.tdinh.academic.supercomputerSimulator.model.Job;

/**
 * Class <tt>Arrival</tt> presents an Arrival event of a 
 * job to a system.
 *  
 * @author tuan
 *
 */
public class Arrival extends Event {

	public Arrival(Job j, double t) {
		super(EventType.ARRIVAL, j, t);
	}

	@Override
	public void handler() {
	}
	
	@Override
	public String toString() {
		return "An arrival event scheduled to run at " + this.time;
	}
}
