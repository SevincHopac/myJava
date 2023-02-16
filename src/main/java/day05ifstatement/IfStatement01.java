package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //kullanicidan alinan sayinin tek mi cift mi ekrana yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int num = input.nextInt();

        if (num%2 ==0){
            System.out.println("cift");
        }else{
            System.out.println("tek");
        }


        //Example2
        // sayi - + nötr mü yazdiriniz

        System.out.println("sayi:");
        double d= input.nextDouble();

        if(d>0){
            System.out.println("+");
        }else if (d<0){                                //else if te dogruyu bulunca digerlerine bakmaz
            System.out.println("-");
        }else {
            System.out.println("nötr");
        }



    }
}
