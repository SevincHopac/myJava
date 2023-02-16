package day28abstraction.animal;

public class Dog extends Mammal{

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void move() {
        System.out.println("Dogs move");
    }
}
