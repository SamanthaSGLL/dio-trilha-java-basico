import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
    public static void main (String[]args){
        Scanner saida = new Scanner (System.in).useLocale(Locale.US);

        System.out.println(" Qual plano você gostaria? ");
        System.out.println("BASIC (B),MIDIA (M) ou TURBO (T)");
        String operador = saida.next();

        switch (operador){
            case "B":{
                System.out.println("BASIC: 100min de ligação");
                break;
            }
            case "M":{
                System.out.println("MIDIA: 100 min de ligação + Whats e Instagram grátis");
                break;
            }
            case "T":{
                System.out.println("TURBO: 100min de ligação+ Whats e Instagram grátis+ 5GB youtube ");
                break;
            }
            default:{
                System.out.println("Essa opção não existe");
            }
        }
        


    }
}
