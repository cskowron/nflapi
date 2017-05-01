package core.endpoints;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum ConcurrentUserService {

    CONCURRENT_USERS("/v1/concurrentusers");

    private String optionValue;

    private ConcurrentUserService(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }
}
