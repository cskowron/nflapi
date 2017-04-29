package beans;

import beans.base.BaseModel;

import java.util.Calendar;

/**
 * Created by Cory on 4/22/2017.
 */
public class Player extends BaseModel {

    private enum RosterStatus{
        ACT("Active"),
        DEV("Developmental Squad"),
        CUT("Cut"),
        RES("Reserved"),
        SUS("Suspended"),
        RSN(""),
        TRD("Traded to another division"),
        TRT("Traded from beans.Team"),
        TRC("Traded to another Conference"),
        EXE("Exempt"),
        NWT("Not with team"),
        PUP("Physically Unable to Perform"),
        UDF("Unsigned Draft Pick"),
        RFA("Restricted Free Agent"),
        UFA("Unrestricted Free Agent"),
        NON("Non-football related injured reserve"),
        RET("Retired");

        private String statusValue;

        RosterStatus(String statusValue) {
            this.statusValue = statusValue;
        }

        String getStatusValue() {
            return this.statusValue;
        }
    }

    private enum InjuryStatus {
        ACTIVE("Active"),
        PROBABLE("Probable"),
        QUESTIONABLE("Questionable"),
        DOUBTFUL("Doubtful"),
        INACTIVE("Inactive");

        private String injuryStatusValue;

        InjuryStatus(String injuryStatusValue) {
            this.injuryStatusValue = injuryStatusValue;
        }

        String getStatusValue() {
            return this.injuryStatusValue;
        }
    }

    private RosterStatus rosterStatus;
    private InjuryStatus injuryStatus;
    private String picture;
    private PlayerPosition playerPosition;
    private Team team;
    private int jerseyNumber;
    private Calendar activeSince;
    private Calendar retiredDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RosterStatus getRosterStatus() {
        return rosterStatus;
    }

    public void setRosterStatus(RosterStatus rosterStatus) {
        this.rosterStatus = rosterStatus;
    }

    public InjuryStatus getInjuryStatus() {
        return injuryStatus;
    }

    public void setInjuryStatus(InjuryStatus injuryStatus) {
        this.injuryStatus = injuryStatus;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public PlayerPosition getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(PlayerPosition playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
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
