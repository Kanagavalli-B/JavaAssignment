package abstractandencap;

public class EncapAccess {
    public static void main(String[] args) {
        EncapExample en = new EncapExample();
        en.setId(101);
        en.setName("sita");
        int a = en.getId();
        String name = en.getName();
        System.out.println("empID " + a + " name " + name);
    }
}