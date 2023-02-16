package day25exception;

public class E01 {


    /*1)"Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.

      2) Exception lar ile calismanin iki yolu vardir

            a) try-catch block kullanma ve exception olussa bile calısmayı devam ettirme

            b) throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamız
            gerekiyor ise bu dosyamız eger silinmis ise java dosyayi bulamaz ve uygulanın devam etmesi gerekmez)

      3) Eger exception'ı handle etmez isek (sorunu halletmezsek) java calismayi durdurur.

      4) try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz

      5) try catch olmaksizin yanliz kullanilamaz.

      6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz  try-catch block iciene koymalisiniz

      7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir

      8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
         System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
         e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
         System.err.println(); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz

      9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez



    * */



    public static void main(String[] args) {


        divide(6, 2);
        divide(0, 2);
        divide(2, 0);  // Arithmetic Exception //  by Zero
        divide2(5,0);
    }

    //1.Yol
    public static void divide(int a, int b) {

        if (b == 0)
            System.out.println("Sayi sifira bölünemez");
        else
            System.out.println(a / b);
    }

    //2.yol try-catch kullanarak exception i handle etmek tavsiye edilir.
    public static void divide2(int a,int b){

        try {
            System.out.println(a/b);
            System.out.println("hi exception");
        }catch (ArithmeticException e){
            System.out.println("Bölme isleminde bir problem olustu->" + e.getMessage());
            e.printStackTrace();
            System.err.println("Bölme isleminde bir problem olustu");
        }
    }
}
//java matematik ile ilgili karsilmasi muhtemel tüm Exceptionlari Arithmetic Exception class i na koymusutr.
