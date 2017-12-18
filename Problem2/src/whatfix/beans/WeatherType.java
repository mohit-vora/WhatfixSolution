package whatfix.beans;

import java.util.Arrays;

/**
 * WeatherType Enum.
 */
public enum WeatherType {

	/**
	 * The singleton instance for weather type: Sunny.
	 * This has the numeric value of {@code 0}.
	 */
	SUNNY("Sunny"),
	
	/**
     * The singleton instance for weather type: Rainy.
     * This has the numeric value of {@code 1}.
     */
	RAINY("Rainy"),
	
    /**
     * The singleton instance for weather type: Windy.
     * This has the numeric value of {@code 2}.
     */
	WINDY("Windy");

	private static final WeatherType[] ENUMS = WeatherType.values();

	private WeatherType() {
		// Restrict instantiation
	}

	 /**
     * Obtains an instance of {@code WeatherType} from an {@code int} value.
     *
     * @param weatherType  the weather type to represent, from 0 (Sunday) to 6 (Saturday)
     * @return the day-of-week singleton, not null
	 * @throws Exception if the day-of-week is invalid
     */
	public static WeatherType of12(int weatherType) throws Exception {
		if (weatherType < 0) {
			throw new Exception("Invalid value for WeatherType: " + weatherType);
		}
		return ENUMS[weatherType];
	}
	
	public static boolean contains(String pWeatherType) {
		return Arrays.stream(ENUMS	)
				.anyMatch(weatherType -> weatherType.toString().equalsIgnoreCase(pWeatherType));
	}
	
	private String type;

    private WeatherType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
