package day23inheritancepolymorphism.animal;

public class Animal {

    public void eat(){

        System.out.println("Animals eat");
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multily(int a,int b){
        return a*b;
    }

    public Animal create(){  // Overridden Method
        return new Animal();
    }

}
