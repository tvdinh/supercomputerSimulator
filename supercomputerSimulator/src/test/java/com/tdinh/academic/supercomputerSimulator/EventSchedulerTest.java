package com.tdinh.academic.supercomputerSimulator;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.tdinh.academic.supercomputerSimulator.event.Arrival;
import com.tdinh.academic.supercomputerSimulator.event.Departure;
import com.tdinh.academic.supercomputerSimulator.event.Event;
import com.tdinh.academic.supercomputerSimulator.event.EventScheduler;
import com.tdinh.academic.supercomputerSimulator.model.Job;

/**
 * To test the authenticity of the EventScheduler in terms of 
 * @author tuan
 *
 */
public class EventSchedulerTest extends TestCase {

	private EventScheduler es;
	
	private static Logger logger = Logger.getLogger(EventSchedulerTest.class);
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EventSchedulerTest ( String testName )
    {
        super( testName );
    }

    public void setUp() {
      	logger.info("Initalise an EventScheduler");
    	es = new EventScheduler();
    }
    
    public void testUnique() {
    	Event e1 = new Arrival(new Job(1),1.0);
    	Event e2 = new Arrival(new Job(2),5.0);
    	Event e3 = new Departure(new Job(3),3.0);
    	logger.info("Add event: " + e1.toString());
    	es.addEvent(e1);
    	logger.info("Add event: " + e2.toString());
    	es.addEvent(e2);
    	logger.info("Add event: " + e3.toString());
    	es.addEvent(e3);
    	Assert.assertEquals(e1,es.nextEvent());
    	Assert.assertEquals(e3,es.nextEvent());
    	Assert.assertEquals(e2,es.nextEvent());
    	if (e2 != es.nextEvent()) {
    		logger.error("Event mismatch at time " + e2.getTime());
    	}
    }
    
	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(EventSchedulerTest.class);
         for (Failure failure: result.getFailures()) {
        	 System.out.println(failure.toString());
         }
         System.out.println(result.wasSuccessful());
	}

}
