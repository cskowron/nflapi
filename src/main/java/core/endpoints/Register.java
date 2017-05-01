package core.endpoints;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum Register {

    USERS("/v1/users"),
    USERNAME_EXISTS("/v1/users/%S/exists");

    private String optionValue;

    private Register(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }
}
