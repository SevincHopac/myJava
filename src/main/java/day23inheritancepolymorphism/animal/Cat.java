package day23inheritancepolymorphism.animal;

public class Cat extends Mammal{

    public void moew(){
        System.out.println("cats meow");
    }

    @Override // (annotation @ li olanlar bu sekilde isimlendirilir)
              // bununla javanin yaptigimiz islemi kontrol etmesini saglariz
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multily(int a, int b) {
        return a*b+1;
    }

    @Override
    public Mammal create() {  //Overriding Method
        return new Mammal();
    }



    /*
    1)Override yaparken "method'un body" si değiştirilir.

    2)Override yaparken ASLA "method signature"(isim ve parametre) değiştirilemez.

    3)Override yaparken "inheritance" olmak zorundadır.

    4)Override yaparken "access modifier" lar belli kurallara göre farklılaştırılabilirler.
         i)"private" methodlar override edilemez

         ii) Child class daki override edilen method un access modifier i ayni veya
             daha genis olmali

        iii)default methodlar farkli package dan override edilemez

    5)Parent Class'daki methodun "return type" i void ise "return type" degistirilemez.

    6)Parent Class'daki methodun "return type" i primitive ise "return type" degistirilemez.

    7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.

    8)Parent Class'daki methodun "return type" i Parent Class ise "return type" child lardan biri olabilir.

           Note: Child Class'daki return type Parent Class'dakinden genis olamaz.

           Note: Aralarinda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return Type degisiminde
                 kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat ararlarinda "Parent Child" iliskisi
                 olmadigindan "Integer" yerine "Short" kullanamazsiniz.

           Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.

           Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.

     9)Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
                          HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.

    10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
       "final" method body degistirilmesine musaade etmez.

    11) Polymorphism  = Overloading + Overriding

             Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin

    12) Overloading ile Overriding arasindaki farklar nelerdir?

                i)Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir.

                ii)"private" method'lar Overload edilebilir, Override edilemezler.

                iii)"final" method'lar Overload edilebilir, Override edilemezler.

                iv)"Overloading" "static polymorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir.
                   Cunku "static" method'lar Overload edilebilir, Override edilemezler.

                v) "Overloading" de method signature degisir ama "Overriding" method signature a dokunulmaz.



    "final" method body degistirilmesine musaade etmez.

    "final" keyword nedir?

    "final" keyword i)variable'larda kullanılabilir.

                         public final int age = 12;
                         a)Atanan değer değiştirilemez.

                         b)Değer ataması yapmak zorundasınız.

                    ii)Method'larda kullanılabilir.

                        public final int add(){
                                return a+b;
                        }

                        a)Bir method oluşturulurken "final" olarak oluşturulmuş ise
                          o method'un body'si asla değiştirilemez. Dolayısıyla o method Override edilemez.

                    iii)Class'larda kullanılabilir.
                        Bir Class'ı "final" yaparsanız o Class'ı kısırlaştırmış olursunuz.
                        Bir Class "final" ise o Class'a extend edilemez.
 */


}
