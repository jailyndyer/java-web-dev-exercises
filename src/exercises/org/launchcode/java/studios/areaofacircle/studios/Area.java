package exercises.org.launchcode.java.studios.areaofacircle.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);

        System.out.println("The area of a circle with a radius of " + radius + " is " + area + "." );
    }
}
