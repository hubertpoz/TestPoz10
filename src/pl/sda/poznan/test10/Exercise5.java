package pl.sda.poznan.test10;

// Importing libraries
import java.lang.Math;
import java.util.Scanner;

public class Exercise5 {
 public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);

  // Read first integer value
  System.out.println("Podaj pierwszą liczbę całkowitą");
  int a = userInput.nextInt();

  // Read second integer value
  System.out.println("Podaj drugą liczbę całkowitą");
  int b = userInput.nextInt();

  // addition
  double addition_result = a + b;
  System.out.println("a = " + a + ", b = " + b + ", wynik to " + addition_result);

  // subtraction
  double subtraction_result = a - b;
  System.out.println("a = " + a + ", b = " + b + ", wynik to " + subtraction_result);

  // multiplication
  double multiplication_result = a * b;
  System.out.println("a = " + a + ", b = " + b + ", wynik to " + multiplication_result);

  // division
  double division_result = a / b;
  System.out.println("a = " + a + ", b = " + b + ", wynik to " + division_result);

  // raising to a power
  double power_result = Math.pow(a, b);
  System.out.println("a = " + a + ", podniesione do potęgi " + b + ", daje nam " + power_result);
 }
}
