package beans;

import beans.base.BaseModel;

import java.util.Calendar;

/**
 * Created by Cory on 4/22/2017.
 */
public class Coach extends BaseModel {

    private ProfilePicture picture;
    private Team team;
    private String biography;
    private Calendar activeSince;
    private Calendar retiredDate;

    public ProfilePicture getPicture() {
        return picture;
    }

    public void setPicture(ProfilePicture picture) {
        this.picture = picture;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
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
