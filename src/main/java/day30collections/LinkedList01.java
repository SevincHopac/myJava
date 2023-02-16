package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");

        System.out.println(names);

        System.out.println(names.peek()); //bossa null atiyor
        System.out.println(names);

        System.out.println(names.element());
        System.out.println(names);

        System.out.println(names.pop()); //  bossa Exception atiyor
        System.out.println(names);

        System.out.println(names.poll()); // bossa null atiyor
        System.out.println(names);


        LinkedList<String> names1 = new LinkedList<>();

        System.out.println(names1.peek());


        // 'A' ile baslayan isimleri '*****' e cevir.

        LinkedList<String> names2 = new LinkedList<>();
        names2.add("Chris");
        names2.add("Alexandre");
        names2.add("Mark");
        names2.add("Tom");
        names2.add("Jeremy");
        names2.add("Hans");

        System.out.println(names2);

        for (String w : names2) {
            if (w.startsWith("A")) {
                names2.set(names2.indexOf(w), "*****");
            }
        }
        System.out.println(names2);


        //Listdeki 4 harfden cok harf iceren isimleri siliniz


        for (int i =0; i<names2.size(); i++) {
            if (names2.get(i).length() > 4) {
                names2.remove(names2.get(i));
                i--;
            }
        }
        System.out.println(names2);
    }
}
