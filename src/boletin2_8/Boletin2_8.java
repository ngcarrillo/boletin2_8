/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import java.util.Scanner;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Intoroduce una temperatura en grados Celsius");
        Scanner tempCelsius = new Scanner (System.in);
        float celsius = tempCelsius.nextFloat();
        double temFar = celsius * 1.8 + 32 ;
        double tempK = celsius + 273 ;
        System.out.println("La temperatura en Farenheit es " +temFar+"\nLa temperatura en Kelvin es "+tempK);
    }
    
}
