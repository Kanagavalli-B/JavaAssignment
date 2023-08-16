package abstractandencap;

public abstract class AbstractExample {
    void add(int a, int b) {
        int c = a + b;
        System.out.println("sum of two numbers " + c);
    }
    public abstract void sub(int var1, int var2);
}

