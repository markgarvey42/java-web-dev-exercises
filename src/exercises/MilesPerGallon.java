package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Miles driven:");
        double miles = input.nextDouble();
        System.out.println("Gas consumed (gallons):");
        double gas = input.nextDouble();
        double mpg = miles / gas;
        System.out.println("MPG: "+mpg);
    }
}
