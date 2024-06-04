public class Main {
    public static void main(String[] args) {
        Book book = new Book("qualquer coisa", "sei la", "2032", true);
        BookManager.addBook(book);
        BookManager.listBooks();
        BookManager.removeBook("qualquer coisa");
        BookManager.listBooks();
    }
}