package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        kullanicidan günsayisini aliniz ,gun adini yaziniz
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Gün numarasini giriniz:");
        byte gunNo = input.nextByte();

        switch (gunNo){

            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("gecerli gun num giriniz.");
        }

    }
}
