package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        String sentence = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> sentenceList = new ArrayList<>(Arrays.asList(sentence.split("\\W")));

        leastFive(sentenceList);

    }

    public static Integer findSum(ArrayList<Integer> l) {

        int sum = 0;
        for(int i : l) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;

    }

    public static void leastFive(ArrayList<String> list) {

        Scanner input = new Scanner(System.in);
        System.out.println("Show words with this many characters: ");
        int search = input.nextInt();
        int counter = 0;

        for(String word : list) {
            if(word.length() == search) {
                System.out.println(word);
                counter++;
            }
        }
        System.out.println("There are "+counter+" words with "+search+" characters!");
        input.close();
    }

}
