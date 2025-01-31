import java.util.Scanner;
import java.util.Locale;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.print("Qual o seu nome?: ");
            String nome = entrada.next();
    
            System.out.print("Digite a sua idade :");
            int idade = entrada.nextInt();
    
            System.out.print("Digite a sua altura :");
            Double altura = entrada.nextDouble();
    
            
        }
        catch(java.util.InputMismatchException e){
            System.out.print("Você digitou a idade e/ou a altura de forma incorreta");
        }
        
    }
    
}
