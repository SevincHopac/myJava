package day30collections.queue;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    //(oncelik)PriorityQueue Java kendisine gore bir oncelik belirleyerek siralama yapar

    //Biz istersek siralamayi belirleyebiliriz

    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        myQueue.add(null); // nullPointerException
        System.out.println(myQueue);


    }
}
