import java.util.Scanner;

public class Console {

    public static Scanner scanner = new Scanner(System.in);

    public static String readLine(){
        return scanner.nextLine();
        
    }

    public static int readInt(){
        try{
            return scanner.nextInt();
        }catch (Exception e){
            
            System.out.println("Invalid input");
            scanner.nextLine();
            return readInt();
    }
}
    public static double readDouble(){
        
        return scanner.nextDouble();
}
}
