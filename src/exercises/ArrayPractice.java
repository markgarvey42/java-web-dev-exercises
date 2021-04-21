package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,3,5,8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] WORDS = sentence.split("\\.");


        for (int i : array) {
            if( i % 2 > 0)
            System.out.println(i);
        }

        System.out.println(Arrays.toString(WORDS));



    }
}
