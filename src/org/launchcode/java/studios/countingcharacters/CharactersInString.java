package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Scanner;


public class CharactersInString {
    public static void main(String[] args) {

        //In this studio, you will write a program to count the number of times each character
        // occurs in a string and then print the results to the console.
        Scanner scan = new Scanner(System.in);

        HashMap<Character, Integer> holdValues = new HashMap<>();

        System.out.println("Enter a string to determine the number of each character present:");
        String userEntry = scan.nextLine();

        String quote = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        //String file = "/Users/Mark & Dexter/Desktop/Code/example_text.txt";

        findCharactersInString(userEntry, holdValues);

    }

    public static void findCharactersInString(String str, HashMap<Character, Integer> holdValues) {

        str = str.replaceAll("\\W", "").toLowerCase();
        char[] charactersInString = str.toCharArray();

        for (char ch : charactersInString) {
            if (holdValues.get(ch) == null) {
                holdValues.put(ch, 1);
            } else {
                int currentValue = holdValues.get(ch);
                holdValues.put(ch, currentValue + 1);
            }
        }

        System.out.println(holdValues.entrySet());
    }}
