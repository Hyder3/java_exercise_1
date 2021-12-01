import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
                        System.out.println("Mettre une valeur à n svp");
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

                case "freq":
                    System.out.println("Mettre le chemin du fichier svp");
                    str = sc.nextLine();
                    str = str.trim();
                    Path path = Paths.get(str);
                    int rep = 0;
                    int[] repeat = new int[20];
                    String mot = "";
                    String[] motFreq = new String[20];
                    try {
                        String readFilePath = Files.readString(path).replaceAll("\\p{Punct}", "");
                        System.out.println("Ce qu'il y a dans le fichier \n" + readFilePath);
                        String[] words = readFilePath.split(" ");
                        var freqCaseInSensitive = Arrays.stream(words)
                                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
                        System.out.println(freqCaseInSensitive);
                    } catch (IOException e) {
                        System.out.println("Unreadable file \n" + e.getClass() + "\n" + e.getMessage());
                    }
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
}