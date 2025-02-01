import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        ContaTerminal Conta = new ContaTerminal();

        System.out.println("DIgite o numero da conta : ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o numero da agencia :");
        String numeroAgencia = sc.next();

        System.out.println("Digite o seu nome :");
        String NomeCliente = sc.next();

        System.out.println(" Digite o saldo da conta :");
        Double saldoConta = sc.nextDouble();

        Conta.nomeCliente(NomeCliente);
        Conta.numerosAgencia(numeroAgencia);
        Conta.numerosConta(numeroConta);
        Conta.contaBancaria(saldoConta);
        
        System.out.println(" \n Ola "+ Conta.nome + ", obrigado por criar uma conta em nosso banco , sua agencia e " + Conta.agencia + ", conta " + Conta.conta + " e seu saldo " + Conta.saldo + "\n ja estao disponiveis para saque");
        

       




    }
}
