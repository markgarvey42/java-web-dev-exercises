package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();

        if(radius <= 0) {
            while(radius <= 0) {
                System.out.println("Error: Enter in a valid number.");
                System.out.println("Enter a radius: ");
                radius = input.nextDouble();
            }
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}





