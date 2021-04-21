package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        addStudent(students);

    }

    public static void addStudent(HashMap<Integer, String> students) {
        Scanner input = new Scanner(System.in);

        String name;
        do {
            System.out.println("Enter student's name: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.println("Enter ID #:");
                int id = input.nextInt();
                students.put(id, name);

                input.nextLine();
            }

        } while (!name.equals(""));
        input.close();
        System.out.println("Your students and their ID's are: "+students.entrySet());
    }
}
