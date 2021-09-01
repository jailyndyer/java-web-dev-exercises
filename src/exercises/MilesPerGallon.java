package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How much gas have you used (in gallons)");
        Double gasUsed = input.nextDouble();

        System.out.println("Your miles-per-gallon is " + milesDriven/gasUsed + "." );
    }
}
