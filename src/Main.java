public class Main {
    public static void main(String[] args) {
        Book book = new Book("Title", "Author", "Year", "Status");
        BookRegister.addBook(book.getTitle(), book.getAuthor(), book.getYear(), book.getStatus());
        BookRegister.listBooks();
    }
}