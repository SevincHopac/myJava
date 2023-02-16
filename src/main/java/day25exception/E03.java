package day25exception;

public class E03 {

    public static void main(String[] args) {
        String str = "Ali";
        getNumOfChars(str);

        String s = "";
        getNumOfChars(s);

        String t = null;
        getNumOfChars(t);
    }

    public static void getNumOfChars(String str) {
        try {
            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("length() methodunda bir problem olustu->" + e.getMessage());
            e.printStackTrace();
        }
    }
}
