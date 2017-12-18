package whatfix.beans;

import java.util.List;

/**
 * Weather Bean.
 */
public class Weather {
			
	private WeatherType weatherType;

	// It will be either +ve (if increase) or -ve (if reduce) percentage
	private int craterChangeRate;
	private List<String> suitableVehicleNames;

	public Weather() {
		// Default constructor
	}
	
	public Weather(WeatherType weatherType, int craterChangeRate, List<String> sustainableVehicleNames) {
		super();
		this.weatherType = weatherType;
		this.craterChangeRate = craterChangeRate;
		this.suitableVehicleNames = sustainableVehicleNames;
	}

	public WeatherType getWeatherType() {
		return weatherType;
	}

	public void setWeatherType(WeatherType pWeatherType) {
		weatherType = pWeatherType;
	}

	public int getCraterChangeRate() {
		return craterChangeRate;
	}

	public void setCraterChangeRate(int pCraterChangeRate) {
		craterChangeRate = pCraterChangeRate;
	}

	public List<String> getSuitableVehicleNames() {
		return suitableVehicleNames;
	}

	public void setSuitableVehicleNames(List<String> pSustainableVehicleNames) {
		suitableVehicleNames = pSustainableVehicleNames;
	}
}
