package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 1: Kullanici gun numarasini girsin kod gun ismini yazsin
//           2==>Pazartesi      5==>Persembe ...


        Scanner input= new Scanner(System.in);
        System.out.println("Gun numarasi giriniz: ");
        byte gunNo= input.nextByte();

        if (gunNo==1){
            System.out.println("Pazar");
        }
        else if (gunNo==2){
            System.out.println("Pazartesi");
        }
        else if (gunNo==3){
            System.out.println("Sali");
        }
        else if (gunNo==4){
            System.out.println("Carsamba");
        }
        else if (gunNo==5){
            System.out.println("Persembe");
        }
        else if (gunNo==6){
            System.out.println("Cuma");
        }
        else if (gunNo==7){
            System.out.println("Cumartesi");
        }else {
            System.out.println("gecerli bir gun no giriniz!");
        }


    }
}
