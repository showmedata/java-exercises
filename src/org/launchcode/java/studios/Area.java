package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by 007 on 2/27/2017.
 */
public class Area {
    public static void main(String [] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        //String radius = "";
        //double area = 0;
        Double PI = 3.14;
        Double radius = 0.0;

        while(radius == 0.0) {
            System.out.println("Enter a radius:");
            radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Please enter a positive number");
            } else {
                Double area = PI * radius * radius;
                System.out.println("The area of the circle: " + area);
            }
            radius = 0.0;
        }






        //while (radius.equals("")){
          //  System.out.println("Enter the radius of a circle");
            //radius = scanner.next();
            //Double r2;
            //r2 = Double.parseDouble(radius);
            //area = 3.14 * r2*r2;
            //System.out.println("The area of the circle is: " + area);


    }
}
