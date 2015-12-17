package com.tdinh.academic.supercomputerSimulator.util;

/**
 * Class <tt>Parameter</tt> contains public fields/constants 
 * related to the supercomputer 
 * @author tuan
 *
 */
public class Parameter {
	
	//Enforce non-initiation
	private Parameter() {
		throw new AssertionError();
	}
	
	public static final int SERVER_POOL_MAX_CAPACITY = 1192;
}
