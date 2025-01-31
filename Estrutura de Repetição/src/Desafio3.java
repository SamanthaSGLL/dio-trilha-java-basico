import java.util.Scanner;
import java.util.Locale;

public class Desafio3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite qualquer numero positivo");
        int numero = entrada.nextInt();
        int x = 0;

        while (numero >= 0){
            x=x+numero;

            System.out.println("Digite qualquer numero positivo");
            numero = entrada.nextInt();

        }

        System.out.println("A soma de todos os numeros positivos listados é igual a " + x);

        entrada.close();

    }
}
