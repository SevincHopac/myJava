package day30collections.set;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 { //Natural order

/*
        TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge"(Natural Order) dizer.
        TreeSet cooook yavas calisir.

        Note: Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir ama TreeSet ler coook yavas calistigi icin biz,
              elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek TreeSet in yavas olma problemini asmis oluruz.
     */

    public static void main(String[] args) {

        //Example 1: Sekiz tane unique String elemani alfabetik sirada depolayiniz.
        //1.Way: Slow

        Long start1 = LocalTime.now().toNanoOfDay();

        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);// [a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]

        Long end1 = LocalTime.now().toNanoOfDay();

        System.out.println(end1 - start1);//3254000

        //2.Way: Fast

        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmailsSorted = new TreeSet(myEmails);   // HashSet i TreeSet e cevirmek icin bu kodu yazdik.

        System.out.println(myEmailsSorted);

        Long end2 = LocalTime.now().toNanoOfDay();

        System.out.println(end2 - end1);//139000

      //  myEmailsSorted.add(null);     //  NullPointerException


    }




        /*
    TreeSet tekrars??z elemanlar?? "alfabetik" veya "k??????kten b??y????e"(Natural Order) dizer.
    TreeSet ??oook yava?? ??al??????r.

    Note: Tekrars??z elemanlar?? natural order'da depolamak i??in TreeSet kullanmak mant??kl??d??r ama TreeSet'ler ??oook yava?? ??al????t?????? i??in biz,
          elemanlar?? ??nce HashSet'e depolar??z sonra HashSet'i TreeSet'e ??evirerek TreeSet'in yava?? olma problemini a??m???? oluruz.

    * TreeSet :
    * 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
    * 2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge)gore dizer.
    * 3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmali...
    * 4) TreeSet "null" object'ini eleman olarak kullanilamaz.
 */
    }
