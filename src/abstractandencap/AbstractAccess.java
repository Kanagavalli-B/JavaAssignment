package abstractandencap;

import java.util.Scanner;

public class AbstractAccess extends AbstractExample {
    @Override
    public void sub(int a, int b) {
        int c = a - b;
        System.out.println("the subtraction of two numbers " + c);
    }

    public static void main(String[] args) {
        AbstractAccess aa = new AbstractAccess();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        aa.sub(a, b);
        aa.add(a, b);
    }
}
