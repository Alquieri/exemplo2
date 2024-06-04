import java.util.ArrayList;
public class BookManager {

public static ArrayList<Book> books;

public static void addBook(Book b){

    books.add(b);
}
public static void removeBook(String title){
    if (books.isEmpty()){
        System.out.println("\nNo books found");
    }
    for (int i = 0; i < books.size(); i++){

        if (books.get(i).getTitle().equals(title)){
            System.out.println("\n"+books.get(i).toString() + "\nAre you sure you want to remove it?(y/n)");
            String answer = System.console().readLine();
            
            if (answer.equals("y")){
                books.remove(i);
            }
            else{
                System.out.println("\nOperation aborted");
            }
        }
    }
}
public static void listBooks(){
    if (books.isEmpty()){
        System.out.println("\nNo books found");
    }
    for (int i = 0; i < books.size(); i++){
        System.out.println(books.get(i).toString());
    }
}
}
