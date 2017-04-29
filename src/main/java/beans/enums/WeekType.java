package beans.enums;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum WeekType {
    HOF("Hall of Fame"),
    PRE("Non HOF Preseason"),
    REG("Regular Season"),
    WC("Wild Card"),
    DIV("Divisional Championship"),
    CONF("Conference Championship"),
    SB("Super Bowl"),
    PRO("Pro Bowl");

    private String optionValue;

    public String getOptionValue() {
        return this.optionValue;
    }

    WeekType(String optionValue) {
        this.optionValue = optionValue;
    }
}
