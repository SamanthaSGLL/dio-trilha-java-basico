package DesafioPOO.Telefone;
import java.util.Scanner;
import DesafioPOO.Aparelho.AparelhoTelefonico;
import DesafioPOO.Aparelho.NavegarInternet;
import DesafioPOO.Aparelho.ReprodutoMusical;

public class SmartPhone implements AparelhoTelefonico,NavegarInternet ,ReprodutoMusical{
	Scanner entrada=new Scanner(System.in);
	boolean chamada=false;
	String url;
	String musica;
	boolean botao=false;
	@Override
	public void ligar() {
		this.chamada=true;
		System.out.println("Ligando...");
	}

	@Override
	public void atender() {
		this.chamada=false;
		System.out.println("Desligando...");
	}

	@Override
	public void iniciarCorreioVoz() {
		this.chamada=false;
		System.out.println("Chamada caiu...");
		
		
	}

	@Override
	public void exibirPagina(String url) {
		this.url=url;
		System.out.println("Digite nome do site :");
		url=entrada.next();
		
		System.out.println("Abrindo :"+ url);
		
		
		
	}

	@Override
	public void AdicionarNovaAba() {
		System.out.println("Adicionando nova Aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando....");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musica=musica;
		System.out.println("Digite o nome da musica:");
		musica=entrada.next();
	}
	

	@Override
	public void pausar() {
		this.botao=false;
		System.out.println("Musica Pausada");
		
	}

	@Override
	public void ligarMusica() {
		this.botao=true;
		selecionarMusica(musica);
		
	}

}
