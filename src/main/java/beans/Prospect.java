package beans;

import java.util.Calendar;
import java.util.List;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class Prospect {

    private ProfilePicture profilePicture;
    private Team team;
    private List prospectCombineStats;
    private List positions;
    private int jerseyNumber;
    private Calendar activeSince;
    private Calendar retiredDate;

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List getProspectCombineStats() {
        return prospectCombineStats;
    }

    public void setProspectCombineStats(List prospectCombineStats) {
        this.prospectCombineStats = prospectCombineStats;
    }

    public List getPositions() {
        return positions;
    }

    public void setPositions(List positions) {
        this.positions = positions;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Calendar getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(Calendar activeSince) {
        this.activeSince = activeSince;
    }

    public Calendar getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(Calendar retiredDate) {
        this.retiredDate = retiredDate;
    }
}
