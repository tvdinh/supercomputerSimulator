package com.tdinh.academic.supercomputerSimulator.event;

import com.tdinh.academic.supercomputerSimulator.model.Job;

/**
 * Class <tt>Departure</tt> presents a departure event (that
 * a job is completed successfully) 
 * @author tuan
 *
 */
public class Departure extends Event {
	
	public Departure(Job j, double t) {
		super(EventType.DEPARTURE, j, t);
	}

	@Override
	public void handler() {
	}
	
	@Override
	public String toString() {
		return "A departure event scheduled to run at " + this.time;
	}
}
