package inheritandpoly;

public class BookAccessing {
    public static void main(String[] args) {
        BookChild bc=new BookChild();
        bc.bookName="Alice in wonderland";
        bc.bookId = 101;
        bc.author="Lewis caroll";
        bc.getBook();
        bc.read();
        bc.returnBook();
    }
}
