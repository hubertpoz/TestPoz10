package pl.sda.poznan.test10;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String []args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Podaj swoje imie");
        String name = userInput.nextLine();
        System.out.println("Twoje imie to " + name);
        if (name.equals("John Wick")) {
            System.out.println("Witaj Babajaga, kolejne zlecenie ?");
        }
        else {
            System.out.println("Witaj, " + name);
        }
    }
}