/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        String choice, wholeTemp = "nothing";
        double temp, convertTemp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        choice = sc.next();

        if(choice.equals("F") || choice.equals("f")) {
            wholeTemp = "Fahrenheit";
            System.out.print("Please enter the temperature in Celsius: ");
            temp = sc.nextDouble();

            convertTemp = (temp * 9 / 5) + 32;
        }
        else if (choice.equals("C") || choice.equals("c")) {
            wholeTemp = "Celsius";
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = sc.nextDouble();

            convertTemp = (temp - 32) * 5/9;
        }

        DecimalFormat format = new DecimalFormat("0.#");

        System.out.printf("The temperature in %s is %s.", wholeTemp, format.format(convertTemp));
    }
}
