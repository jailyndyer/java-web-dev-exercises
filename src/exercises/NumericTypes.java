package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("What is the width of the rectangle?");
        int width = Integer.parseInt(input.nextLine());

        System.out.println("The area of your rectangle is " + width*length + "." );
    }
}
