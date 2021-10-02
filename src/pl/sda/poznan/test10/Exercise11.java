package pl.sda.poznan.test10;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner readPassword = new Scanner(System.in);
        String password;
        String correctPassword = "Tamagochi";

        while (true)
        {
            System.out.println("Podaj hasło: ");
            password = readPassword.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Git Haseło");
                break;
            } else {
                System.out.println(password);
                System.out.println("Ale jak to zamknięte ??? :P");
            }
        }
    }
}