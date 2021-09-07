package studios.countingchars;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnalyzeString {
    public static void main(String[] args) {

       String myString = getString();
       char [] charactersInString = myString.toCharArray();

       HashMap <String, Integer> charCounts = new HashMap<>();

       for (int i=0; i<charactersInString.length; i++) {
           var charUpper = String.valueOf(charactersInString[i]).toUpperCase();
           if (!charCounts.containsKey(charUpper)) {
               charCounts.put(charUpper, 1);
           } else {
               Integer num = charCounts.get(charUpper);
               num++;
               charCounts.put(charUpper, num);
           }
       }

       for (Map.Entry<String, Integer> charCount : charCounts.entrySet()) {
           System.out.println(charCount.getKey() + ": " + charCount.getValue());
       }
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character string: ");
        return input.nextLine();
    }
}
