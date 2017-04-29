package beans;

import java.util.List;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class Venue {
    private String id;
    private String name;
    private Location location;
    private VenueType type;
    private ForecastWeather currentWeather;
    private List forecastWeather;
}
