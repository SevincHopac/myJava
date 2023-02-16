package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        ///kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("islemi giriniz:  + - * / %");
        char islem = input.next().charAt(0);

        System.out.print("ilk sayiyi giriniz:");
        double num1 = input.nextDouble();

        System.out.print("ikinci sayiyi giriniz:");
        double num2 = input.nextDouble();

        //float , double,boolean konulmaz //  int,byte,short,String,char
        switch (islem){
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case'%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Gecerli islem giriniz!");
        }

    }
}
