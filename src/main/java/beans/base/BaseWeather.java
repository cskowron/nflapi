package beans.base;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class BaseWeather {

    private int highFarenheit;
    private int lowFarenheit;
    private int highRealFeelFarenheit;
    private int lowRealFeelFarenheit;
    private int windSpeedMph;
    private String windDirection;
    private int windGustMph;
    private int visibilityMiles;
    private String shortDescription;
    private String longDescription;

    public int getHighFarenheit() {
        return highFarenheit;
    }

    public void setHighFarenheit(int highFarenheit) {
        this.highFarenheit = highFarenheit;
    }

    public int getLowFarenheit() {
        return lowFarenheit;
    }

    public void setLowFarenheit(int lowFarenheit) {
        this.lowFarenheit = lowFarenheit;
    }

    public int getHighRealFeelFarenheit() {
        return highRealFeelFarenheit;
    }

    public void setHighRealFeelFarenheit(int highRealFeelFarenheit) {
        this.highRealFeelFarenheit = highRealFeelFarenheit;
    }

    public int getLowRealFeelFarenheit() {
        return lowRealFeelFarenheit;
    }

    public void setLowRealFeelFarenheit(int lowRealFeelFarenheit) {
        this.lowRealFeelFarenheit = lowRealFeelFarenheit;
    }

    public int getWindSpeedMph() {
        return windSpeedMph;
    }

    public void setWindSpeedMph(int windSpeedMph) {
        this.windSpeedMph = windSpeedMph;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(int windGustMph) {
        this.windGustMph = windGustMph;
    }

    public int getVisibilityMiles() {
        return visibilityMiles;
    }

    public void setVisibilityMiles(int visibilityMiles) {
        this.visibilityMiles = visibilityMiles;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
