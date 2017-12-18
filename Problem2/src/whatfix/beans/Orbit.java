package whatfix.beans;

import java.io.Serializable;

/**
 * Orbit Bean, which contains route/orbit related details.
 * 
 */
public class Orbit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String orbitName;

	private String source;
	private String destination;

	// Default unit is megamiles.
	private int distance;
	private int numberOfCraters;
	
	private Velocity velocityLimit;
	
	public Orbit() {
		// Default constructor
	}
	
	public Orbit(String orbitName, String source, String destination, int distance, int numberOfCraters, Velocity velocityLimit) {
		this.setOrbitName(orbitName);
		this.source = source;
		this.destination = destination;
		this.distance = distance; // Default unit is megamile.
		this.numberOfCraters = numberOfCraters;
		this.velocityLimit = velocityLimit;
	}
	
	public String getOrbitName() {
		return orbitName;
	}

	public void setOrbitName(String pOrbitName) {
		orbitName = pOrbitName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String pSource) {
		source = pSource;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String pDestination) {
		destination = pDestination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int pDistance) {
		distance = pDistance;
	}

	public int getNumberOfCraters() {
		return numberOfCraters;
	}

	public void setNumberOfCraters(int pNumberOfCraters) {
		numberOfCraters = pNumberOfCraters;
	}

	public Velocity getVelocityLimit() {
		return velocityLimit;
	}

	public void setVelocityLimit(Velocity pVelocityLimit) {
		velocityLimit = pVelocityLimit;
	}
}
