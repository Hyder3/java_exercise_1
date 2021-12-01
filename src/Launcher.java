import java.util.Scanner;
public class Launcher {

    public static void main(String[] args) {
        System.out.println("Welcome !!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Rentrez un mot svp");
        String str = sc.nextLine();

        if(str == "quit"){

        } else {
            System.out.println("Unknown command");
        }
    }
}