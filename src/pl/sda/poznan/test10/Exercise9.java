package pl.sda.poznan.test10;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner messagesCount = new Scanner(System.in);

        // Read input from user
        System.out.println("Ile komunikatów wyświetlić? ");
        int last = messagesCount.nextInt();

        for (int i = 0; i < last; i++) {
            System.out.println("To jest " + i + " komunikat w pętli");
        }
    }
}