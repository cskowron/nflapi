package beans;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class ReceivingStats {

    private int targets;
    private int receptions;
    private int yards;
    private float yardsPerReception;
    private int firstDowns;
    private float firstDownPercentage;
    private int touchdowns;
    // TODO: find non-keyword name
    private int long;
    private boolean longTouchdowns;
    private int twentyPlus;
    private int fortyPlus;
    private int fumbles;

    public int getTargets() {
        return targets;
    }

    public void setTargets(int targets) {
        this.targets = targets;
    }

    public int getReceptions() {
        return receptions;
    }

    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public float getYardsPerReception() {
        return yardsPerReception;
    }

    public void setYardsPerReception(float yardsPerReception) {
        this.yardsPerReception = yardsPerReception;
    }

    public int getFirstDowns() {
        return firstDowns;
    }

    public void setFirstDowns(int firstDowns) {
        this.firstDowns = firstDowns;
    }

    public float getFirstDownPercentage() {
        return firstDownPercentage;
    }

    public void setFirstDownPercentage(float firstDownPercentage) {
        this.firstDownPercentage = firstDownPercentage;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public boolean isLongTouchdowns() {
        return longTouchdowns;
    }

    public void setLongTouchdowns(boolean longTouchdowns) {
        this.longTouchdowns = longTouchdowns;
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
