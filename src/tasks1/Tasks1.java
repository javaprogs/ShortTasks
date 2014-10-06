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
public class Tasks1 {

    public static void pierwsze(int max) {
        //zakres: 2-max
        for (int i = 2; i <= max; i++) {
            //ilosc dzielników - dzielniki
            int dzielniki = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    dzielniki++;
                    //break bo jak znajdzie dzielnik to już nie ma po co dalej szukać
                    break;
                }
            }
            // j<i w pętli więc nie biorę pod uwagę podanej liczby dlatego dzielniki ==0
            if (dzielniki == 0) {
                //drukuj podana liczbe
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        pierwsze(10000);
        System.out.println(Potega.potegaLast(5.0, 2.0));
    }
}

