package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number between 0 and 10: ");
            int number = scanner.nextInt();

            String numberName;
            switch (number) {
                case 0:
                    numberName="zero";
                    break;
                case 1:
                    numberName = "one";
                    break;
                case 2:
                    numberName = "two";
                    break;
                case 3:
                    numberName = "three";
                    break;
                case 4:
                    numberName = "four";
                    break;
                case 5:
                    numberName = "five";
                    break;
                case 6:
                    numberName = "six";
                    break;
                case 7:
                    numberName = "seven";
                    break;
                case 8:
                    numberName = "eight";
                    break;
                case 9:
                    numberName = "nine";
                    break;
                case 10:
                    numberName = "ten";
                    break;
                default:
                    System.out.println("Cannot give you the name");
                    continue;
            }

            System.out.println("The name of the number is: " + numberName);
        }
    }
}