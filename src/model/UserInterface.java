package model;

public class UserInterface {
    
   
   public static void interface(){

    System.out.println("##Menu##");
    System.out.println("1-Register book");
    System.out.println("2-Show all books");
    System.out.println("3-Search book");
    System.out.println("4-Remove book");
    System.out.println("5-");
    System.out.println("");
    System.out.println("");


   }

   
    public static void system(){
        
        int option;
        do
        {
            interface();
            option.Console.LerInt();
            readOption();
        }
        while (option != 0); 
            
        

    }
}
