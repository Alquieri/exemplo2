public class Main {
    public static void main(String[] args) {
        Book book = new Book("qualquer coisa", "sei la", "2032", true);
        System.out.println(book);
        BookRegister.addBook(book);
        BookRegister.listBooks();
    }
}