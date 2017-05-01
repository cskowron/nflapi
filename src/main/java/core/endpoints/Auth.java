package core.endpoints;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum Auth {

    TOKEN("/v1/oauth/token");

    private String optionValue;

    private Auth(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }
}
