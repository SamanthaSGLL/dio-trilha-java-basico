package Banco;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public void setNome (String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
}
