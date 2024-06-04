import java.util.ArrayList;
public class BookRegister {

public static ArrayList<Book> books = new ArrayList<Book>();

public static void addBook(Book b){

    books.add(b);
}
public static void removeBook(String title){
    for (int i = 0; i < books.size(); i++){

        if (books.get(i).getTitle() == title){
            System.out.println(books.get(i).toString() + "Are you sure you want to remove it?(y/n)");
            String answer = System.console().readLine();
            if (answer == "y"){
                books.remove(i);
            }
            else{
                System.out.println("Operation aborted");
            }
        }
    }
}
public static void listBooks(){
    if (books.size() == 0){
        System.out.println("No books found");
    }
    for (int i = 0; i < books.size(); i++){
        System.out.println(books.get(i).toString());
    }
}
}
