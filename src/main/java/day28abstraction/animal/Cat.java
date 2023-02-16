package day28abstraction.animal;

public class Cat extends Mammal{

    /*
    Bir method parent class ta abstract method ise
    child class o methodu override edip kullanmak zorundadir
    Bu yüzden herhangi bir fonksyonu child class icin mecburi yapmak isterseniz,
    o methodu abstract yapmalisiniz.

     */



    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}
