package day32maps.maps;

import day32maps.Student;

import java.util.Hashtable;

public class HashTable01 {

    /*
            1)HashTable bir map'dir.
            2)HashTable entrySet'leri herhangi bir sirlamaya tabi tutmaz.
            3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
            4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);

        System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null, 90000000);// HashTable'larda key null olamaz. NullPointerException
        //countryPopulations.put("France", null);// HashTable'larda value null olamaz. NullPointerException


        Hashtable<String, Student> myStudents = new Hashtable<>();


        myStudents.put("Math",new Student("Ali","gmail",21,true));
        System.out.println( myStudents);


        String name = myStudents.get("Math").name;
        System.out.println(name);

        int age =  myStudents.get("Math").age;
        System.out.println(age);




    }

/*    INTERWIEW QUESTIONS
    MAP'LER ARASINDAKI FARKLAR
            1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

            2) Treemap'ler natürel order yapar.
    LinkedHashMap giriş sırasına göre listeler.
    HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

            3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
    TreeMap'lerde key'ler icin "null" kullanılmaz.
    HashTable larda ikisi içinde null kullanılmaz.*/

}