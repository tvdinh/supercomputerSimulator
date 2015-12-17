package com.tdinh.academic.supercomputerSimulator.model;

/**
 * Class <tt>Server</tt> presents a server in the
 * super-computing system.
 * @author tuan
 *
 */
public class Server {

	private ServerState state;
	private double remainProctime; //second
	
	public Server(ServerState state, double rProctime) {
		this.state 			= state;
		this.remainProctime = rProctime;
	}
	
	public Server() {
		this(ServerState.IDLE, 0.0);
	}
	
	/**
	 * Setters
	 */
	public void setState(ServerState s) { this.state = s;}
	public void setRemainProcTime(double rProctime) {this.remainProctime = rProctime;}
	
	/**
	 * Getters
	 */
	public ServerState getState() 	  { return this.state;}
	public double getRemainProcTime() { return this.remainProctime;}
	
	/**
	 * Update the server states deltat second after  the
	 * last refresh
	 * @param deltat
	 */
	public void refresh(double deltat) {}
	
	
	/**
	 * Initialize a job on this server
	 * @param j
	 * @return true if successful, false if otherwise
	 */
	public boolean initializeJob(Job j) {
		//TODO
		return false;
	}
	
	/**
	 * 
	 * @return true if the server is idle, false otherwise
	 */
	public boolean isIdle() {
		return (state == ServerState.IDLE);
	}
}
