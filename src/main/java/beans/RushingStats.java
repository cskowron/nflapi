package beans;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class RushingStats {

    private int attempts;
    private int yards;
    private float yardsPerAttempt;
    private float yardsPerGame;
    private int touchdowns;
    private float firstDownPercentage;
    // TODO: find non-keyword name;
    private int long;
    private boolean longTouchdown;
    private int twentyPlus;
    private int fortyPlus;
    private int fumbles;

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public float getYardsPerAttempt() {
        return yardsPerAttempt;
    }

    public void setYardsPerAttempt(float yardsPerAttempt) {
        this.yardsPerAttempt = yardsPerAttempt;
    }

    public float getYardsPerGame() {
        return yardsPerGame;
    }

    public void setYardsPerGame(float yardsPerGame) {
        this.yardsPerGame = yardsPerGame;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public float getFirstDownPercentage() {
        return firstDownPercentage;
    }

    public void setFirstDownPercentage(float firstDownPercentage) {
        this.firstDownPercentage = firstDownPercentage;
    }

    public boolean isLongTouchdown() {
        return longTouchdown;
    }

    public void setLongTouchdown(boolean longTouchdown) {
        this.longTouchdown = longTouchdown;
    }

    public int getTwentyPlus() {
        return twentyPlus;
    }

    public void setTwentyPlus(int twentyPlus) {
        this.twentyPlus = twentyPlus;
    }

    public int getFortyPlus() {
        return fortyPlus;
    }

    public void setFortyPlus(int fortyPlus) {
        this.fortyPlus = fortyPlus;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
}
