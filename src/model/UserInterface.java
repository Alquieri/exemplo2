package model;

public class UserInterface {
    
   
   public static void interface(){

    System.out.println("##Menu##");
    System.out.println("1-Register book");
    System.out.println("2-Show all books");
    System.out.println("3-Search book");
    System.out.println("4-Remove book");
    


   }

   public static void readOption(){

   }
    public static void system(){
        
        int option;
        do
        {
            interface();
            option = 
            readOption();
        }
        while (option != 0); 
            
        

    }
}
