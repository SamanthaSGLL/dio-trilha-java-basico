package Banco;

public abstract class Conta implements IConta {
	
	private static  int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected static int AGENCIA_PADRAO = 0;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia=Conta.AGENCIA_PADRAO;
		this.numero=SEQUENCIAL++;
		this.cliente=cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		this.saldo= saldo-valor;
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo= saldo+valor;
		
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		
	}
	protected void imprimirInfosComuns() {
		System.out.println("TItular: " + this.cliente.getNome());
		System.out.println("Agencia :" + this.agencia);
		System.out.println("Numero :" +this.numero);
		System.out.println("Saldo :"+ this.saldo);
	}
	
	


}
