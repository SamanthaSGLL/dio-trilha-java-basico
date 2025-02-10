package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		System.out.println("SERVINDO A MESA");
		pegarLancheCozinha();
	}
    private void pegarLancheCozinha() {
		System.out.println("PEGANDO LANCHE");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO ");
	}
	void trocarGas() { 
		System.out.println("ATENDENTE TROCANDO O GAS");
	}
	public void pegarPedidoBalcao() {
		System.out.println("Pegando pedido do Balcao");
	}
}
