package inheritandpoly;

public class BookChild extends Book{
    @Override
    void getBook() {
        System.out.println("childbook is read");
    }
    void read() {
        System.out.println(bookName + " was read");
    }

}
