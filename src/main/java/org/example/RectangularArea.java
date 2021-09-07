package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class RectangularArea
{
    public static void main( String[] args )
    {
        final double conversion_factor = 0.09290304;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();
        while (length < 0) {
            System.out.print("Negative values are invalid. Please enter a positive length in feet: ");
            length = input.nextDouble();
        }

        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();
        while (width < 0) {
            System.out.print("Negative values are invalid. Please enter a positive width in feet: ");
            width = input.nextDouble();
        }

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        double area = length * width;
        System.out.format("The area is: \n%.2f square feet\n", area);

        double meters = area * conversion_factor;
        System.out.format("%.3f square meters", meters);

    }
}
