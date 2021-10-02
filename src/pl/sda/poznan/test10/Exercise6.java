package pl.sda.poznan.test10;
// Importing libraries
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        // Input password
        System.out.println("Poproszę hasło ");
        String s = userInput.nextLine();

        // Print password on standard output
        System.out.println("Podane hasło to " + s);

        // Check the password input by user
        if (s.equals("Tamagochi")) {
            System.out.println("Witaj w tajnym miejscu.");
        }
    }
}