package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // kullanicidan en boy al aln ve cevre hesapla

        Scanner input = new Scanner(System.in);
        System.out.println("kisa kenar:");
        int en= input.nextInt();

        System.out.println("uzun kenar:");
        int boy= input.nextInt();

        System.out.println("alan:"+ en*boy);
        System.out.println("cevre:"+ 2*(en+boy));

    }
}
