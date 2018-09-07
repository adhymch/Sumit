package Class;

/**
 *
 * @author User
 */
public class Coupling implements Metric {

    private final double coeCoup = 0.129;

    public double getResult(int Asso) {
        return coeCoup * Asso;
    }

    /*public int getMetricVal(int Asso) {
        return Asso;
    }*/

}
