package exercises;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Enter a word from this sentence below";
        System.out.println(sentence + ".");
        String word = input.nextLine();

        Integer index = sentence.indexOf(word);
        Integer length = word.length();

        System.out.println("The word you entered is at the index of " + index + ".");
        String newSentence = sentence.replace(word+" ", "");
        System.out.println(newSentence + ".");
    }
}
