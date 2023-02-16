package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner kullanicidan data almaya yarar, java class i dir. kullanmak icin import etmek gerekir.
        //Scanner class i java nin util library sinde


        Scanner scan = new Scanner(System.in);
        System.out.print("yasinizi giriniz:");
        byte age = scan.nextByte();
        System.out.println(age);



    }
}
