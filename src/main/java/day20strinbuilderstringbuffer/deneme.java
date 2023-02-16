package day20strinbuilderstringbuffer;

public class deneme {

    public static void main(String[] args) {


        StringBuilder str = new StringBuilder(5);
        System.out.println(str.capacity());

        str.append("1234");
        System.out.println(str.capacity());

        str.append("5");
        System.out.println(str.capacity());

        str.append("6");
        System.out.println(str.capacity());  // (5*2)+2 capacity

        str.setCharAt(1,'0');
        System.out.println(str);

        str.delete(0,3);
        System.out.println(str);

        str.reverse();
        System.out.println(str);






    }
}
