/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.ArrayList;

/**
 *
 * @author Clinton
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrimeNumbers PrimeNums = new PrimeNumbers(1, 100);
        System.out.println(PrimeNums.myNumbers());
    }
}
