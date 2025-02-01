public class ContaTerminal {

    int conta=0;
    String agencia= "";
    String nome = "";
    Double saldo =0.0;
    
    public void numerosConta (int NumeroConta){
        conta=NumeroConta;

    }

    public void numerosAgencia(String NumeroAgencia){
        agencia=NumeroAgencia;
    }

    public void nomeCliente (String NomeCliente){
        nome=NomeCliente;
    }
    public void contaBancaria (Double ValorSaldo){
        saldo=ValorSaldo;
    }
    

}
