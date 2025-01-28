public class ContaTerminal {

    int conta=0;
    String agencia= "";
    String nome = "";
    Double saldo =0.0;
    
    public void conta (int NumeroConta){
        conta=NumeroConta;

    }

    public void agencia(String NumeroAgencia){
        agencia=NumeroAgencia;
    }

    public void name (String NomeCliente){
        nome=NomeCliente;
    }
    public void contaBancaria (Double ValorSaldo){
        saldo=ValorSaldo;
    }
    

}
