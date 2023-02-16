package day26exceptions;

public class Exception01 {

    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);


        String str1 = "1a2b";
        int r = convertStringToInteger(str1);     //NumberFormatException: Eger icinde rakamdan farkli character barindiran bir String'i
                                                  // valueOf() kullanark Integer'a cevirmek isterseniz NumberFormatException alirsiniz
        System.out.println(r + 10);


    }

    public static int convertStringToInteger(String str) {
        int i = 0;
        try {
            //Herhangi bir satirda "Exception" atilirsa
            // Java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz

            i = Integer.parseInt(str);
            System.out.println("Try bolumu");

        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren Stringler Integer a cevrilemez");
        }
        return i;
    }

}
