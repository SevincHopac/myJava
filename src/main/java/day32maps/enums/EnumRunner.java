package day32maps.enums;

public class EnumRunner {
    public static void main(String[] args) {


        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr);

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        System.out.println(UsStates.getStateNameFromCapital("Denver"));

        System.out.println(UsStates.getAbbrefromCapital("Salem"));
    }

}
