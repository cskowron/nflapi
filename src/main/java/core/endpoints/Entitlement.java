package core.endpoints;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum Entitlement {

    USER_ROLES("/v1/users/%S/roles"),
    DEVICE_ROLES("/v1/devices/%S/roles");

    private String optionValue;

    private Entitlement(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }
}
