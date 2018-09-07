package Class;

/**
 *
 * @author User
 */
public class Understandability {

    private final double Cov = 1.33515;

    public double getResult(double Coup, double Coh, double Inherit) {
        double understandability;

        if (Coup != 0 || Coh != 0 || Inherit != 0) {
            understandability = Cov + Coup + Coh + Inherit;
        } else {
            understandability = 0;
        }
        return understandability;
    }
}