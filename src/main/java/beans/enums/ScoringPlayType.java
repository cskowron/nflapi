package beans.enums;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public enum ScoringPlayType {

    TD("touchdown"),
    FG("field goal"),
    PAT("extra point kick"),
    PAT2("2 point conversion"),
    SFTY("safety");

    private String optionValue;

    public String getOptionValue() {
        return this.optionValue;
    }

    ScoringPlayType(String optionValue) {
        this.optionValue = optionValue;
    }
}
