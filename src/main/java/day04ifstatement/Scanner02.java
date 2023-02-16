package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

         /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */

        //kullanicidan ilk ve son isimini aliniz. ilk harflerini ekrana yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz: ");
        char ilk = input.next().charAt(0);

        System.out.println("soyisim:");
        char son= input.next().charAt(0);

        System.out.println(" " + ilk + son);  //char ASCII degerini tutar //bu birlestirmenin sonucu String dir !!




/*
        //2.Yol

        System.out.println("tam isminizi giriniz:");
        String fullName = input.nextLine();

        char ilkHarf =fullName.charAt(0);
        System.out.print(ilkHarf);

        char soyIlkHarf = fullName.split(" ")[1].charAt(0);
        System.out.println(soyIlkHarf);*/












    }
}
