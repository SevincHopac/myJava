package day32maps.maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        // Size verilen bir kelimedeki kullanilan harflerin kacar kere kullanildigini gösteren kodu yaziniz

        String str = "abbcaa";
        String[] harfler = str.split("");
        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler));

        HashMap<String,Integer> gosterge = new HashMap<>();

        for (String w : harfler){

            Integer tekrarSayisi=gosterge.get(w);

            if (gosterge.get(w)==null){
                gosterge.put(w,1);
            }else {
                gosterge.put(w,tekrarSayisi+1);
            }
        }
        System.out.println(gosterge);
    }
}
