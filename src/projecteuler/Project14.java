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
public class Project14 {

    static int counter = 1;

    public static int method(int result) {
      while(result!=1){
            if (result % 2 == 0) {
                result = result / 2;
            } else {
                result = 3 * result + 1;
            }
            counter++;
        }
        
        return counter;
    }
    static int result;
    static int finalResult=0;
    public static int searchTheLargestChain(){
 
    for (int i =1; i<=1000000;i++){
    result = method(i);

    
    if (result > finalResult){
        finalResult=result;
       
    } 
}       return finalResult;
}
}
