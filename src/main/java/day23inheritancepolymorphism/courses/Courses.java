package day23inheritancepolymorphism.courses;

public class Courses {

    public void liveSessions(){
        System.out.println("Courses are live");
    }
    public Courses(){
        System.out.println("ConstructorA");
    }
    public Courses(String s){
        System.out.println("ConstructorB");
    }
}
