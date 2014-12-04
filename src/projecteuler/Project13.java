/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edward
 */
public class Project13 {

    public static void euler13() {

        try {
            URL url = new URL("https://projecteuler.net/problem=13");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            String[] split = new String[100];
            String str1;
            int j = 0;
            while ((str = in.readLine()) != null) {

                if (str.matches("[0-9]+<br />")) {
                    split[j] = (str.substring(0, 50));

                    BigInteger[] b = new BigInteger[split.length];

                    b[j] = new BigInteger(split[j]);

                    BigInteger suma = new BigInteger("0");

                    suma = b[j].add(suma);
                    j++;
                    if (j == 100) {
                        System.out.println(suma.toString().substring(0, 10));
                    }
                }
            }
            in.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Project13.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
