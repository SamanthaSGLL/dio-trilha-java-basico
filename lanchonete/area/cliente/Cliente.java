package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZER O PEDIDO");
		
	}
	public void pagarConta() {
		System.out.println("PAGANDO A CONTA");
		consultaSaldoAplicativo();
	}
	private void consultaSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO BANCO");
		
	}
	
	
}
