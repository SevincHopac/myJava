package day28abstraction.animal;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void move() {
        System.out.println("Birds move");
    }
}
