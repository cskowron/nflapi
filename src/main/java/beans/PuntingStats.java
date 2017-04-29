package beans;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class PuntingStats {

    private int punts;
    private int yards;
    private float yardsPerPuntAvg;
    private int netYards;
    private float netYardsPerPuntAvg;
    private int longest;
    private int blocked;
    private int outOfBounds;
    private int downed;
    private int puntsInside20;
    private int touchbacks;
    private int puntsFairCaught;
    private int returnYards;
    private int returnTouchdowns;
    private int numberReturned;

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public float getYardsPerPuntAvg() {
        return yardsPerPuntAvg;
    }

    public void setYardsPerPuntAvg(float yardsPerPuntAvg) {
        this.yardsPerPuntAvg = yardsPerPuntAvg;
    }

    public int getNetYards() {
        return netYards;
    }

    public void setNetYards(int netYards) {
        this.netYards = netYards;
    }

    public float getNetYardsPerPuntAvg() {
        return netYardsPerPuntAvg;
    }

    public void setNetYardsPerPuntAvg(float netYardsPerPuntAvg) {
        this.netYardsPerPuntAvg = netYardsPerPuntAvg;
    }

    public int getLongest() {
        return longest;
    }

    public void setLongest(int longest) {
        this.longest = longest;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public int getOutOfBounds() {
        return outOfBounds;
    }

    public void setOutOfBounds(int outOfBounds) {
        this.outOfBounds = outOfBounds;
    }

    public int getDowned() {
        return downed;
    }

    public void setDowned(int downed) {
        this.downed = downed;
    }

    public int getPuntsInside20() {
        return puntsInside20;
    }

    public void setPuntsInside20(int puntsInside20) {
        this.puntsInside20 = puntsInside20;
    }

    public int getTouchbacks() {
        return touchbacks;
    }

    public void setTouchbacks(int touchbacks) {
        this.touchbacks = touchbacks;
    }

    public int getPuntsFairCaught() {
        return puntsFairCaught;
    }

    public void setPuntsFairCaught(int puntsFairCaught) {
        this.puntsFairCaught = puntsFairCaught;
    }

    public int getReturnYards() {
        return returnYards;
    }

    public void setReturnYards(int returnYards) {
        this.returnYards = returnYards;
    }

    public int getReturnTouchdowns() {
        return returnTouchdowns;
    }

    public void setReturnTouchdowns(int returnTouchdowns) {
        this.returnTouchdowns = returnTouchdowns;
    }

    public int getNumberReturned() {
        return numberReturned;
    }

    public void setNumberReturned(int numberReturned) {
        this.numberReturned = numberReturned;
    }
}
