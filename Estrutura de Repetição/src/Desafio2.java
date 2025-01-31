import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva um numero de 1 a 10");
        int numero = entrada.nextInt();

        for (int x=1; x<=10 ;x++){
            int calculo = x * numero;

            System.out.println(x + "x" + numero + "=" + calculo);
        }

    }
    entrada.close();

}
