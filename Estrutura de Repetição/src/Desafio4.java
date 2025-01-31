import java.util.Scanner;
import java.util.Locale;

public class Desafio4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        boolean verdade= true;
        
        while (verdade){
            System.out.println("Digite um numero inteiro para saber se é primo ou não ");
            int numero = entrada.nextInt();

            int i=1;
            int soma=0;
            for (i=1;i<=numero;i++){
                if (numero % i ==0){
                    soma++;
                }
            }
            if (soma ==2){
                System.out.println("O numero :"+ numero +" é primo");
            }
            else{
                System.out.println("O numero :"+ numero +" não é primo");
            }

            System.out.println("Deseja continuar ? Sim (s)/ Nao (n)");
            String continuar = entrada.next();

            switch (continuar){
                case "s":{
                    verdade = true;
                    break;
                }
                case "n":{
                    verdade = false;
                    break;
                }
            }
                
        }
            
        entrada.close();
    }
}

