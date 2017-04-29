package beans;

import java.util.Calendar;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class PlayerProfile {

    private String displayName;
    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private double heightInchas;
    private int weighttLbs;
    private Player player;
    // TODO playerStats
    private String college;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public double getHeightInchas() {
        return heightInchas;
    }

    public void setHeightInchas(double heightInchas) {
        this.heightInchas = heightInchas;
    }

    public int getWeighttLbs() {
        return weighttLbs;
    }

    public void setWeighttLbs(int weighttLbs) {
        this.weighttLbs = weighttLbs;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
