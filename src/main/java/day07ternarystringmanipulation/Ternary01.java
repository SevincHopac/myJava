package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        //Example1: bir sayinin + olup olmadigini ekrana yazdiran kodu yaziniz

        int a = 0;

        // Condition     ?        dogru         yanlis
        String result = a > 0 ? "pozitif" : "pozitif degil";
        System.out.println("result = " + result);

        //Example2: iki sayidan kucuk olani

        int b = 12, c = 12;

        int min = b < c ? b : c;

        System.out.println("min = " + min);

        //ctrl + alt + l


        //Example3: verilen sayinin mutlak degerini

        int d = 6;

        int abs = d < 0 ? -1 * d : d;

        System.out.println("abs = " + abs);

        //Example4 : iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "islem yapamam" desin

        int e = 12;
        int f = -11;

        Object islem = (e > 0 && f > 0) || (e < 0 && f < 0) ? e * f : "islem yapamam";

        System.out.println("islem = " + islem);

        //Note: Java'da her class'in en az bir tane "parent" class'i vardir.
//      Sadece "Object" class'in "parent" class'i yoktur.



    }
}
