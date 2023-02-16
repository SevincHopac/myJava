package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int preise = 20000;

    public static void main(String[] args) {
        /*
        Object nasil olusturulur?
        1) Classa isim ver
        2) Object isim ver
        3) =
        4) new keyword unu kullan
        5) Class ismi + () + ;
         */

        Car    myHonda    =    new    Car();  // Constructor

        System.out.println(myHonda.preise);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();

        MethodCreation obj = new MethodCreation(); // baska bir siniftan object olusturabiliyoruz
        System.out.println(obj.toplamaYap(3,5));

     }

    public  void hareketEt() {

        System.out.println("Honda hareket etti");
    }


    public void dur(){
        System.out.println("Honda durdu.");
    }
}
/*
class ==> variable,method ==> Object leri kullanacagiz

 */














