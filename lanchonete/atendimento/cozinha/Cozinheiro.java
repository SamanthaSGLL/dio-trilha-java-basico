package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro{
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE AO BALCÃO");
	}
	public void  adicionarSucoNoBalcao() {
		System.out.println("ADICONANDO O SUCO");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();	
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO O LANCHE");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO O SUCO");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA , LEITE , E LIQUIDIFICADOR");
		
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO OS INGREDIENTES");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA");
	}
	
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngrediente(Almoxarife meuAmigo) {
		meuAmigo.entregarIngrediente();
	}
}
