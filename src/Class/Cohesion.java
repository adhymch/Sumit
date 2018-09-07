package Class;


/**
 *
 * @author User
 */
public class Cohesion implements Metric {

    private final double coeCoh = 0.0463;

    public double getResult(int Attr) {
        return coeCoh * Attr;
    }
    
    /*public int getMetricVal(int Attr){
        return Attr;
    }*/

}