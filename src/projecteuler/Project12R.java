/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Edward
 */
public class Project12R {
      public static long euler12(long n) {
        if (n == 1) {
            return 1;

        } else {
            return (n) + euler12(n - 1);
        }
    }

    public static long findAmountOfDivisors(long n) {
        int result=0;
        for (long i=n; i > 0; i-- ){
            if (n % i == 0) {
                result++;
            }
            
        }
        return result;
    }

    public static long findFirstNumberWith500Divisors (){
        long n = 1;
        while ((findAmountOfDivisors(euler12(n)))<5) {
            n++;
            System.out.println(n);
        }
        return euler12(n);
    }

    

}
