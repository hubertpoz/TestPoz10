package pl.sda.poznan.test10;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner readTemperature = new Scanner(System.in);
        System.out.println("Podaj temperaturę ");
        var temperature = readTemperature.nextDouble();
        CtoF(temperature);
        FtoC(temperature);
        CtoK(temperature);
        KtoC(temperature);
        KtoF(temperature);
        FtoK(temperature);

    }
    private static void CtoF(double temperature) {
        System.out.println("C do F " + ((temperature * 9 / 5) + 32));
    }
    private static void FtoC(double temperature) {
        System.out.println("F do C " + (temperature - 32 / 1.8));
    }
    private static void CtoK(double temperature) {
        System.out.println("C do K " + ((temperature) + 273.15));
    }
    private static void KtoC(double temperature) {
        System.out.println("K do C " + (temperature - 273.15));
    }
    private static void KtoF(double temperature) {
        System.out.println("K do F " + ((temperature - 273.15 )- 32)*(1.8));
    }
    private static void FtoK(double temperature) {
        System.out.println("F do K " + (temperature - 32) / 1.8 + 273.15);
    }
}