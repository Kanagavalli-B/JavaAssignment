package accessmodifier;

public class AccessingClass {

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        int a= am.id;
        System.out.println("my Id is " + a + " and my name is " + am.name + " and salary is " + am.getSalary());
    }
}
