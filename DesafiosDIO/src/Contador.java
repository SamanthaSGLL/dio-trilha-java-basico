import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro :");
        int parametroUm=entrada.nextInt();

        System.out.println("Digite o Segundo parâmetro :");
        int parametroDois=entrada.nextInt();


        try{
            contar(parametroUm,parametroDois);
        }

        catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }


    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        
        if (numero2<numero1) {
            throw new ParametrosInvalidosException();
        
       }
       int resultado = numero2 - numero1;
       for (int i = 0 ; i < resultado;i++){
            System.out.println("Imprimindo numero "+ (i+1) );
       }


       
   }


}
