package day30collections.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque01 {  // Double ended queue

    /*
    Deque: Double Ended Queue manasındadır yani iki uçlu Queue demektir.
           FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiğinde kullanılır.
 */

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();

        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");

        System.out.println(furnitureTruck);  //  [Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        furnitureTruck.push("Refrigerator");  //  [Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        System.out.println(furnitureTruck);





    }
}
