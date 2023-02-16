package day22inheritancepolymorphism.exauto;

public class Honda extends Car{
    public Honda(){
        super("White", 54000);
        System.out.println("Honda Constructor");
    }
    public Honda(String color){
        this.color = color;
    }
}
