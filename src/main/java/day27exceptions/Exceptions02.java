package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    //Bir text file'daki txt'i okuyan kodu yaziniz.

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();

      readTheText();

    }

//1.yol
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
    }
    //2.yol

    public static void readTheText(){
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir char var.");
        }
    }




    /*
     1)FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
       "new"den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosyaya git dedik, Java
       iki endiseye kapildi
            i)Ya adres yanlissa
            ii)Ya verilen adreste dosya yoksa
       Biz "method isminde" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
       olusursa "Exception at" dedik.

     2) while ((k = fis.read()) !=-1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosyadaki
        karakterleri oku dedik. Java bir endiseye kapildi

             i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse

               Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Excepiton at" dedik.

     3) Method isminden sonra "throws IOException" yazarsan??z Java "throws FileNotFoundException" ?? siler. ????nk??;
       "IOException", "FileNotFoundException" ?? kapsar. "IOException", "FileNotFoundException" ??n parent'??d??r, onun yapt??????
       her ??eyi yapabilir, o y??zden "IOException" varken "FileNotFoundException" a gerek yoktur.

     4) G??rdugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken ortaya cikti,
        bu tarz Exception'lara "CompileTimeException" , diger adi "Checked Exception" denir.

        ****************    Exception Handling   **************+
 */


}
