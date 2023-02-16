package day27exceptions;

public class Exceptions01 {
    // verilen iki String'den birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz

    public static void main(String[] args) {
        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println(r1);

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Java", "");
        System.out.println(r3);
    }


    public static double compareNumOfCharacters(String s, String t) {

        double result = 0;
        try {
            result = s.length() / t.length();
        }catch (NullPointerException e){
            System.out.println("length() methodu null ile kullanilamaz   " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("herhangi bir sayi 0 ile bolunemez   " + e.getMessage());
        }finally {
            System.out.println("database ile connection kesildi");
        }
        return result;
    }

    /*
    Java'da birbirine benzeyen üç tane keyword var:
    "final", "finally", "finalize" açıklayınız

    1)"final" bir keyword'dür. Variable, Class ve Method'lar için kullanılır.

    2)"finally" bir "code block" dur.
      "try-catch" veya sadece "try" ile kullanılır.
      "finally" code block içine yazılan kodlar her halükarda çalıştırılır.
      Mesela Database ile connection'ı kesmek her halükarda yapılması gereken bir eylemdir. Bunu "finally" ile yapabiliriz.

    3)"finalize()" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağrılır, bu method data'ları
      imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.

 */



   /* Interview sorusu : "final", "finally", "finalize" nedir?
    final(keyword): ==> final method override edilemez.
    final variable degeri degistirilemez.
    final class child class sahibi olamaz.
            finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

    finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.*/



    /*
    "final" keyword nedir?

    "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.
 */
}
