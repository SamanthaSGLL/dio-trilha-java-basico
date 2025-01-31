import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra ");
        String palavra = entrada.nextLine().toLowerCase(); // converte tudo para letra minusculo

        int vogais = 0;

        for (int i =0; i<palavra.length();i++ ){
            char letra = palavra.charAt(i); // pega o caracter em cada posição de i , exemplo se a primeira letra for P , então i= 0 é 
            //igual a P

            if (letra == 'a' || letra == 'e' || letra =='i' || letra=='o' || letra == 'u'){
                vogais++;
            }
        }

        System.out.println(" A quantidade de vogais que a palavra "+ palavra + " e de :" + vogais);

    }
}
