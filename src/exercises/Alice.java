package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?";
        System.out.println(sentence);
        System.out.println("Enter a term to search for within this sentence: ");
        String search = input.nextLine();
        boolean isValid = sentence.toLowerCase().contains(search.toLowerCase());

        if(isValid) {
            int index = sentence.toLowerCase().indexOf(search.toLowerCase());
            int length = search.length();

            String tempWord = search.toLowerCase() + " ";
            sentence = sentence.toLowerCase().replaceAll(tempWord, "");

            tempWord = " " + search.toLowerCase();
            sentence = sentence.toLowerCase().replaceAll(tempWord, "");

            System.out.println("Index: " + index);
            System.out.println("Length: " + length);
            System.out.println(sentence);
        } else {
            System.out.println(false);
        }
    }
}
