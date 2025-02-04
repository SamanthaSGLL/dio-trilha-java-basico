import java.util.concurrent.ThreadLocalRandom; //colocar valores aleatorios , nesse caso para o salario
import java.util.Scanner;
import java.util.Random; //simular ligação

public class SelecionandoCandidatos{
    public static void main (String[ ]args){
        String [] escolhidos = selecaoCandidatos();
        int i=0;

        for (i=0;i<escolhidos.length;i++){
            if (escolhidos!= null){
                System.out.println(escolhidos[i]);
                entrandoEmContato(escolhidos[i]);
            }
            
        } 

       
    }

    static void entrandoEmContato(String escolhidos){
        int tentativasRealizadas=1;
        boolean continuarTentando=true;
        boolean atendeu=false;

        do{
            atendeu=atender();
            continuarTentando = !atendeu;

            if (continuarTentando ){
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso");
            }
                
        }
        while (continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + escolhidos + " na "+tentativasRealizadas+ " tentativa");
        }
        else{
            System.out.println("Não conseguimos contato com " + escolhidos + ", numero maximo de tentativa " + tentativasRealizadas + " realizadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static String [] selecaoCandidatos(){
        Scanner entrada = new Scanner(System.in);
        String [] candidatos= new String[10];

        System.out.println("Digite o nome de 10 candidatos :");
        int i=1;
        int j=0;

        while(i<=10){
            System.out.print("Nome" + i + " :");
            candidatos[j] = entrada.nextLine();

            i++;
            j++;
        }
        int candidatoSelecionados=0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        String[] selecionados=new String[5];
        while(candidatoSelecionados<5 && candidatoAtual < candidatos.length){
            String escolha=candidatos[candidatoAtual];
            double salarioPretendido= valorPretendido();

            if (salarioBase >= salarioPretendido){
                selecionados[candidatoSelecionados]=escolha;
                candidatoSelecionados++; 
            
            }
            candidatoAtual++;
        }
        for (int k=0 ; k<5 ; k++){
            System.out.println( (k+1)+"° Candidato selecionado :" + selecionados[k]);
        }
        return selecionados;
    }

     static void analisarCandidato(double salarioPretendido){
         double salarioBase=2000.0;

         if (salarioBase>salarioPretendido){
             System.out.println("Ligar para candidato");

         }
         else if(salarioBase==salarioPretendido){
             System.out.println("Ligar para candidato e oferecer contra proposta");
         }
         else{
             System.out.println("Esperar mais candidaturas");
         }
     }
       static double valorPretendido(){
       return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}


    


