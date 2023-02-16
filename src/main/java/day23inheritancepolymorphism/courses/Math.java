package day23inheritancepolymorphism.courses;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }
    public Math(){
        super("x");
        System.out.println("Constructor1");
    }
    public Math(int a){
        this(); //ayni klastaki constracter i kull istiyorsak
        System.out.println("Constructor2");
    }
}
