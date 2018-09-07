/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author User
 */
public class Inheritance implements Metric {

    private final double coeInherit = 0.3405;

    public double getResult(int Child) {
        return coeInherit * Child;
    }

    /*public int getMetricVal(int Child) {
        return Child;
    }*/

}
