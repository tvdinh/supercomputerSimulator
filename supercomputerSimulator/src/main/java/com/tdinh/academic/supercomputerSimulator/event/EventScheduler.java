package com.tdinh.academic.supercomputerSimulator.event;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Class <tt>EventSheduler</tt> portrays a scheduler of events 
 * {@link Event} of super-computing system that manages and 
 * schedule events based on a defined protocol.
 * 
 * @author tuan
 *
 */
public class EventScheduler {

	private PriorityQueue<Event> pq;
	
	public EventScheduler() {
		pq = new PriorityQueue<Event>();
	}
	
	/**
	 * Return the next event which is the head of the priority Queue
	 * @return
	 */
	public Event nextEvent() {
		return pq.poll();
	}
	
	/**
	 * Add an event to the priority queue
	 * @param e
	 */
	public void addEvent(Event e) {
		pq.add(e);
	}
	
	/**
	 * Check if there is any other event to be executed
	 * @return
	 */
	public boolean isEmpty() {
		return pq.isEmpty();
	}

	/**
	 * Return iterable object of all events in the queue 
	 * @return all events
	 */
	public Iterable<Event> allEvent() {
		return pq;
	}
}
