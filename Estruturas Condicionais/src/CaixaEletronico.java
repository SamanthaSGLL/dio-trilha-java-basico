public class CaixaEletronico {
    
    public static void main(String[] args)  {
        double saldo = 200.90;
        double valorSaque= 100.10;

        if (saldo > valorSaque){
            saldo = saldo -valorSaque;
        }
        String formatado = String.format("%.2f",saldo);

        System.out.println("O valor que ficou na sua conta foi de " + formatado);


    }

}


