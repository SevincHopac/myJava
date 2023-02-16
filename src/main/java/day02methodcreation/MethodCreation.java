package day02methodcreation;

public class MethodCreation {

    public static void main(String[] args) {
        //method daki void return type return ü yok

        System.out.println(toplamaYap(1.2, 5));

        double a = toplamaYap(2,6);

        System.out.println(ucSayiyicarp(1.2, 2, 5));
        System.out.println(ikisiniToplaucuncuyleCarp(2, 4, 4.5));


    }

    public static double toplamaYap(double a, double b) {

        return a + b;
    }

    public static double ucSayiyicarp(double a, double b, double c) {

        return a * b * c;
    }

    public static double ikisiniToplaucuncuyleCarp(double a, double b, double c) {

        return (a + b) * c;


    }
}

// main method static, icinde kullanacaklarin da disarda static olmali
//Methodlar aksyondur isimleri de aksiyon olmali
