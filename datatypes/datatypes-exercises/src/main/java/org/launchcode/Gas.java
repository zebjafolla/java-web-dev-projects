package org.launchcode;
import java.util.Scanner;

public class Gas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the miles traveled: ");
        double miles = input.nextDouble();
        System.out.println("Please enter the gallons of gas used during this trip.");
        double gas = input.nextDouble();
        double milesPerGallon = miles / gas;
        System.out.println("Your miles per gallon is " + milesPerGallon + ".");
    }
}
