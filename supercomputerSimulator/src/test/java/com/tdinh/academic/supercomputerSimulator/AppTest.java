package com.tdinh.academic.supercomputerSimulator;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    
	private static Logger logger = Logger.getRootLogger();
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        logger.info("Start App TESTING");
    	assertTrue( true );
    }
    
    public static void main(String [] args) {
		 Result result = JUnitCore.runClasses(AppTest.class);
         for (Failure failure: result.getFailures()) {
        	 System.out.println(failure.toString());
         }
         System.out.println(result.wasSuccessful());
	}
}
