package beans;

import beans.enums.Phase;
import beans.enums.ScoringPlayType;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class GameStatus {

    private String gameClock;
    private int down;
    private String yardsToGo;
    private String yardLineSide;
    private int yardLineNumber;
    private int period;
    private ScoringPlayType scoringPlayType;
    private Phase phase;
    private String possessionTeamId;
    private String possessionTeamAbbr;
    private boolean redzone;
    private int homeTimeoutsRemaining;
    private int visitorTimeoutsRemaining;

    public String getGameClock() {
        return gameClock;
    }

    public void setGameClock(String gameClock) {
        this.gameClock = gameClock;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public String getYardsToGo() {
        return yardsToGo;
    }

    public void setYardsToGo(String yardsToGo) {
        this.yardsToGo = yardsToGo;
    }

    public String getYardLineSide() {
        return yardLineSide;
    }

    public void setYardLineSide(String yardLineSide) {
        this.yardLineSide = yardLineSide;
    }

    public int getYardLineNumber() {
        return yardLineNumber;
    }

    public void setYardLineNumber(int yardLineNumber) {
        this.yardLineNumber = yardLineNumber;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public ScoringPlayType getScoringPlayType() {
        return scoringPlayType;
    }

    public void setScoringPlayType(ScoringPlayType scoringPlayType) {
        this.scoringPlayType = scoringPlayType;
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public String getPossessionTeamId() {
        return possessionTeamId;
    }

    public void setPossessionTeamId(String possessionTeamId) {
        this.possessionTeamId = possessionTeamId;
    }

    public String getPossessionTeamAbbr() {
        return possessionTeamAbbr;
    }

    public void setPossessionTeamAbbr(String possessionTeamAbbr) {
        this.possessionTeamAbbr = possessionTeamAbbr;
    }

    public boolean isRedzone() {
        return redzone;
    }

    public void setRedzone(boolean redzone) {
        this.redzone = redzone;
    }

    public int getHomeTimeoutsRemaining() {
        return homeTimeoutsRemaining;
    }

    public void setHomeTimeoutsRemaining(int homeTimeoutsRemaining) {
        this.homeTimeoutsRemaining = homeTimeoutsRemaining;
    }

    public int getVisitorTimeoutsRemaining() {
        return visitorTimeoutsRemaining;
    }

    public void setVisitorTimeoutsRemaining(int visitorTimeoutsRemaining) {
        this.visitorTimeoutsRemaining = visitorTimeoutsRemaining;
    }
}
