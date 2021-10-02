package pl.sda.poznan.test10;
import java.util.Scanner;

public class Odczyt
{
    public static void main(String[] args)
    {
        Scanner odczyt = new Scanner(System.in);
        int zegar;

        System.out.println("Podaj czas bomby: ");
        zegar =  odczyt.nextInt();

        do
        {
            System.out.println("Bomba wybuchnie za  " +zegar);
            zegar--;
        }
        while (zegar>0);
        System.out.println("BUM!");
    }
}
