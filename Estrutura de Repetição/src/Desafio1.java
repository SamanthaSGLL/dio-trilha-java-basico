import java.util.Scanner;
import java.util.Locale;

public class Desafio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um numero inteiro : ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse numero é par ");
        }
        else{
            System.out.println("Esse numero é impar");
        }
        scanner.close();

    }

}
