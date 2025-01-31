import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        String jogador1, jogador2;
        int contador1 , contador2;
        contador1=0;
        contador2=0;

        for (int i=0;i<N;i++){
            System.out.print("Jogador 1 digite o ataque :");
            jogador1 = entrada.next().toLowerCase();
            System.out.print("Jogador 2 digite o ataque :");
            jogador2 = entrada.next().toLowerCase();

            if (jogador1.equals("ataque") && jogador2.equals("pedra")){
                System.out.println("Jogador 1 venceu");
                contador1++;
            }
            else if (jogador1.equals("pedra") && jogador2.equals("ataque")){
                System.out.println("Jogador 2 venceu");
                contador2++;
            }
            else if( jogador1.equals("pedra") && jogador2.equals("papel")){
                System.out.println("Jogador 1 venceu");   
                contador1++;
            }
            else if (jogador1.equals("papel") && jogador2.equals("pedra")){
                System.out.println("Jogador 2 venceu"); 
                contador2++;
            }
            else if (jogador1.equals("papel") && jogador2.equals("ataque")){
                System.out.println("Jogador 2 venceu");
                contador2++; 
            }
            else if (jogador1.equals("ataque") && jogador2.equals("papel")){
                System.out.println("Jogador 1 venceu");
                contador1++; 
            }
            else if (jogador1.equals("papel") && jogador2.equals("papel")){
                System.out.println("Ambos venceram a partida");
                contador1++;
                contador2++;
            }
            else if (jogador1.equals("pedra") && jogador2.equals("pedra")){
                System.out.println("Não ha ganharadores");
            }
            else{
                System.out.println("Perderam  a partida ");
                break;
            } 

        }

        if (contador1>contador2){
            System.out.print("Jogador 1 venceu a partida");

        }
        else if (contador2>contador1){
            System.out.print("Jogador 2 venceu a partida");
        }
        else if (contador1==contador2){
            System.out.print("Empate");
        }
        else{
            System.out.print("Loser");
        }
        
    }
}
