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
public class Project12 {


    public static int findAmountOfDivisors(int n) {
        int result=0;
        int sqrt = (int) Math.sqrt(n);

        for (int i=1; i <= sqrt; i++ ){
            if (n % i == 0) {
                result++;
            }
            
        }
        return result*=2;
    }

    public static int findFirstNumberWith500Divisors (){
        int suma =0;
        for (int i= 1; findAmountOfDivisors(suma)<500; i++){
            suma = suma + i;
        }
        return suma;
        
        
    }

    

}
