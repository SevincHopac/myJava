package day25exception;

public class E02 {
    public static void main(String[] args) {

        String[] arr = {"Ali", "Can", "Veli"};

        getElementFromArray(arr,2);
        getElementFromArray(arr,4);


    }
    public static void getElementFromArray(String[] arr,int idx){
       try {
           System.out.println(arr[idx]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Array index te bir problem meydana geldi->" + e.getMessage());
           e.printStackTrace(); //detayli mesaji görmek icin
           System.err.println(e); // renkli yaziyor
       }
    }
}
