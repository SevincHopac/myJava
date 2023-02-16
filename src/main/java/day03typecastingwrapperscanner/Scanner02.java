package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz:");
        double num1 = input.nextDouble();


        System.out.println("ikinci  sayiyi giriniz:");
        double num2 = input.nextDouble();

        System.out.println(num1+num2);


    }
}
