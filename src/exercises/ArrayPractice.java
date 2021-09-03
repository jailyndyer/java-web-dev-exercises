package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int numbers[] = {1, 1, 2, 3, 5, 8};

        String poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = poem.split(" ");
        System.out.println(Arrays.toString(words));

        poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        words = poem.split("\\.");
        System.out.println(Arrays.toString(words));

        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Integer sum = sumEven(integers);
        System.out.println("The sum of the even integers is " + sum + ".");

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("Unto", "Idiot", "Idiom", "No", "New"));
        findFiveLetterWord(wordList);
    }

    public static Integer sumEven(ArrayList<Integer> arg) {
        Integer sum = 0;
        for (Integer listElement : arg) {
            if (listElement%2 == 0) {
                sum += listElement;
            }
        }
        return sum;
    }

    public static void findFiveLetterWord(ArrayList<String> arg) {
        String wordList = "The words with a length of 5 is(are) ";
        for (String listElement : arg) {
            if (listElement.length() == 5) {
                wordList += listElement + ", ";
            }
        }
        System.out.println(wordList + ".");
    }
}
