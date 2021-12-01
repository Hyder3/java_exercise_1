import java.util.Scanner;
public class Launcher {

    public static void main(String[] args) {
        System.out.println("Welcome !!!");

        boolean a = true;
        while(a)
        {
            System.out.println("Rentrez un mot svp");
            String str = sc.nextLine();
            if(str.equals("quit")){
                break;
            }
            else {
                System.out.println("Unknown command");
                System.out.println("Rentrez un mot svp");
            }
        }
    }
}