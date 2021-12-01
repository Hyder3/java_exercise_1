import java.util.Scanner;
public class Launcher {

    public static int fibo(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome ");

        Scanner sc = new Scanner(System.in);
        int resultat = 0;
        boolean a = true;
        while(a)
        {
            boolean b =true;
            System.out.println("Rentrez un mot svp");
            String str = sc.nextLine();
            switch(str){

                case "quit":
                    b = false;
                    break;

                case "fibo":
                    int nbre = 0;
                    boolean c = true;
                    while (c){
                        System.out.println("Mettre une valeur a n svp");
                        str = sc.nextLine();
                        str = str.trim();
                        try{
                            nbre = Integer.parseInt(str);
                            c = false;
                        }
                        catch(NumberFormatException nfe){

                        }
                    }
                    resultat = fibo(nbre);
                    System.out.println("le " + nbre + "ieme element de la suite est : " + resultat);

                    b = false;
                    break;

                default:
                    break;
            }
            if(!b){
                break;
            }
        }
    }