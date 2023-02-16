package day07ternarystringmanipulation;

public class NestedTernary01 {

        /*
        Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.

        Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.Dört yılda bir gelen 366 günlük yil
         */


    public static void main(String[] args) {

         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year = 2022;

        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Leap year degil") : (year % 4 == 0 ? "Leap year" : "Leap year degil");


        System.out.println(leap);


         /*
            Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
        */
        String pwd = "K2a3";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gecersiz") : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");

        System.out.println(gecerli);

    }
}

