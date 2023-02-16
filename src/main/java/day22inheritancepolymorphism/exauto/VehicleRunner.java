package day22inheritancepolymorphism.exauto;

public class VehicleRunner {
    public static void main(String[] args) {

        //Example 1: Car turunde, rengi beyaz olan 54000km de 250000TL fiyati olan
        //           2020 model bir Honda Accord ariyorum.

        HondaAccord hacc = new HondaAccord(250000, 2020);

        System.out.println(hacc.color);

    }
}
