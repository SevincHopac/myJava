package day30collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    İlk giren elemanı ilk kullanmanız(First In First Out ==> FIFO) gerektiğinde Queue en iyi seçimdir.
    Queue'da elemanlar "insertion order" a göre dizilirler.
    Queue'da pop(), peek(), poll(), element(), remove() gibi ilk elemanı ilgilendiren birçok method vardır.
 */



    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        wareHouse.add("Milk");

        System.out.println(wareHouse);

        wareHouse.offer("Potatoes"); // capacity uygunsa ekleme yapar
        System.out.println(wareHouse);




    }
}
