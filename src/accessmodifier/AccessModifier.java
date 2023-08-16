package accessmodifier;

public class AccessModifier {
    public int id = 1;
    protected String name = "kats";
    private float salary = 30000.0f;
    public float getSalary() {
        return this.salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}