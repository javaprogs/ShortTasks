/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks1;

/**
 *
 * @author Michael
 */
public class Potega {
    public static int potegaLast(double a,double b){
        int c = (int) Math.pow(a, b);
        c= c %10;
        return c;
    }
}
