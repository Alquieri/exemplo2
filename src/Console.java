public class Console {
    public static Scanner scanner = new Scanner(System.in);
    public static String readLine(){
        return scanner.nextLine();
    }
    public static int readInt(){
        try{
            return scanner.nextInt();
        }catch (Exception e){
            ("Invalid input");
            return readInt();


    }
    public static double readDouble(){
        try{
            return scanner.nextDouble();
        }catch (Exception e){
            ("Invalid input");
            return readDouble();
        }
    }
}