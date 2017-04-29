package beans;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class PenaltyStats {

    private int penaltiesTotal;
    private int penaltiesYardsPenalized	;

    public int getPenaltiesTotal() {
        return penaltiesTotal;
    }

    public void setPenaltiesTotal(int penaltiesTotal) {
        this.penaltiesTotal = penaltiesTotal;
    }

    public int getPenaltiesYardsPenalized() {
        return penaltiesYardsPenalized;
    }

    public void setPenaltiesYardsPenalized(int penaltiesYardsPenalized) {
        this.penaltiesYardsPenalized = penaltiesYardsPenalized;
    }
}
