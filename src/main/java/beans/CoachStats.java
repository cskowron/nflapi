package beans;

import java.util.ArrayList;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class CoachStats {

    private CoachCareerStats coachCareerStats;
    private ArrayList championshipsAttended;
    private ArrayList championshipsWon;
    private ArrayList<Achievement> achievements;
    private CoachSeasonStats seasonStats;
    private ArrayList teamStats;

    public CoachCareerStats getCoachCareerStats() {
        return coachCareerStats;
    }

    public void setCoachCareerStats(CoachCareerStats coachCareerStats) {
        this.coachCareerStats = coachCareerStats;
    }

    public ArrayList getChampionshipsAttended() {
        return championshipsAttended;
    }

    public void setChampionshipsAttended(ArrayList championshipsAttended) {
        this.championshipsAttended = championshipsAttended;
    }

    public ArrayList getChampionshipsWon() {
        return championshipsWon;
    }

    public void setChampionshipsWon(ArrayList championshipsWon) {
        this.championshipsWon = championshipsWon;
    }

    public ArrayList<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(ArrayList<Achievement> achievements) {
        this.achievements = achievements;
    }

    public CoachSeasonStats getSeasonStats() {
        return seasonStats;
    }

    public void setSeasonStats(CoachSeasonStats seasonStats) {
        this.seasonStats = seasonStats;
    }

    public ArrayList getTeamStats() {
        return teamStats;
    }

    public void setTeamStats(ArrayList teamStats) {
        this.teamStats = teamStats;
    }
}
