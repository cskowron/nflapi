package beans;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class TeamScore {

    private int pointsTotal;
    private int pointsQ1;
    private int pointsQ2;
    private int pointsQ3;
    private int pointsQ4;
    private int[] pointsOvertime;
    private int pointsOvertimetotal;

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public int getPointsQ1() {
        return pointsQ1;
    }

    public void setPointsQ1(int pointsQ1) {
        this.pointsQ1 = pointsQ1;
    }

    public int getPointsQ2() {
        return pointsQ2;
    }

    public void setPointsQ2(int pointsQ2) {
        this.pointsQ2 = pointsQ2;
    }

    public int getPointsQ3() {
        return pointsQ3;
    }

    public void setPointsQ3(int pointsQ3) {
        this.pointsQ3 = pointsQ3;
    }

    public int getPointsQ4() {
        return pointsQ4;
    }

    public void setPointsQ4(int pointsQ4) {
        this.pointsQ4 = pointsQ4;
    }

    public int[] getPointsOvertime() {
        return pointsOvertime;
    }

    public void setPointsOvertime(int[] pointsOvertime) {
        this.pointsOvertime = pointsOvertime;
    }

    public int getPointsOvertimetotal() {
        return pointsOvertimetotal;
    }

    public void setPointsOvertimetotal(int pointsOvertimetotal) {
        this.pointsOvertimetotal = pointsOvertimetotal;
    }
}
