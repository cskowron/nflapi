package beans.enums;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum SeasonType {
    HOF("Hall Of Fame"),
    PRE("Pre-season"),
    REG("Regular Season"),
    POST("Post-season"),
    PRO("Pro Bowl"),
    SB("Super Bowl");

    private String optionValue;

    public String getOptionValue() {
        return this.optionValue;
    }

    SeasonType(String optionValue) {
        this.optionValue = optionValue;
    }
}
