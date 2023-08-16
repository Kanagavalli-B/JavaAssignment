package numandspec;

public class NumAndspecialExtract {
    String number;
    String specialcharacter;
    String givenString = "wFvLrl2xQjyrWrxeNI21@#9w";

    public NumAndspecialExtract() {
    }

    public static void main(String[] args) {
        NumAndspecialExtract ns = new NumAndspecialExtract();
        ns.specialcharacter = ns.givenString.replaceAll("[!^0-9 a-z A-Z]", "");
        ns.number = ns.givenString.replaceAll("[^0-9]", "");
        System.out.println(ns.specialcharacter);
        System.out.println(ns.number);
    }
}
