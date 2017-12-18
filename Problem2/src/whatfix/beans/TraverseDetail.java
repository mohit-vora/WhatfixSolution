package whatfix.beans;

import java.io.Serializable;
import java.util.List;

/**
 * TraverseDetail Bean. 
 * 
 * Here list of orbits that contains sequence of routes/orbits between source and final destinations, 
 * to visit via other destinations/suburbs.
 */
public class TraverseDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// Contains traverse time for all the orbits. Default unit is minutes.
	private int traverseTime; 
	
	// Contains sequence of routes/orbits between source and final destinations, to visit via other suburbs
	private List<Orbit> orbits; 
	private Vehicle vehicle;
	
	public TraverseDetail() {
		// Default constructor
	}
	
	public int getTraverseTime() {
		return traverseTime;
	}

	public void setTraverseTime(int pTraverseTime) {
		traverseTime = pTraverseTime;
	}

	public List<Orbit> getOrbits() {
		return orbits;
	}

	public void setOrbit(List<Orbit> pOrbits) {
		orbits = pOrbits;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle pVehicle) {
		vehicle = pVehicle;
	}
}
