package beans;

import beans.enums.PlayType;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class ActivityStats {

    private double yardsPerPlay;
    private boolean ballCarrier;
    private PlayType playType;

    public double getYardsPerPlay() {
        return yardsPerPlay;
    }

    public void setYardsPerPlay(double yardsPerPlay) {
        this.yardsPerPlay = yardsPerPlay;
    }

    public boolean isBallCarrier() {
        return ballCarrier;
    }

    public void setBallCarrier(boolean ballCarrier) {
        this.ballCarrier = ballCarrier;
    }

    public PlayType getPlayType() {
        return playType;
    }

    public void setPlayType(PlayType playType) {
        this.playType = playType;
    }
}
