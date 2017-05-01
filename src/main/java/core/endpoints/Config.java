package core.endpoints;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum Config  {

    CONFIG("/v1/config");

    private String optionValue;

    private Config(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }
    
}
