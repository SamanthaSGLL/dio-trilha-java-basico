import java.util.Locale;
import java.util.Scanner;

    public class ResultadoEscolar {
        public static void main (String []args){
            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
                System.out.println(" Digite sua nota :");
                float notaEscolar = scanner.nextFloat();

                String resultado = notaEscolar>=7 ? "Aprovado" : notaEscolar >=5 && notaEscolar<7 ? "Recuperação" : "Reprovado";

                System.out.println(resultado);

        }




}
