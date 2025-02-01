import java.util.Scanner;
import java.util.Locale;

public class AnalisandoCandidatos {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        while (true){
            System.out.println("Digite o salario esperado :");
            double salario = entrada.nextDouble();

            analiseCandidatos(salario);

            System.out.println("Deseja continuar ? sim(s) / nao (n)");
            String continuar = entrada.next();

            switch(continuar){
                case "s":{
                    continue;
                }
                case "n":{
                    entrada.close();
                    return;
                }
            }
        }
    }

    static void analiseCandidatos (double salarioEsperado){
        double salarioMaximo=2000.0;

        if (salarioMaximo>salarioEsperado){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioMaximo==salarioEsperado){
            System.out.println("LIGAR PARA CANDIDATO COM UMA CONTRAPROPOSTA");
        }
        else{
            System.out.println("AGUARDAR MAIS CANDIDATOS");
        }
    }
}
