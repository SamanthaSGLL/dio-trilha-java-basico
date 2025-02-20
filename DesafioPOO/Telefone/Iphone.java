package DesafioPOO.Telefone;
import java.util.Scanner;
import DesafioPOO.Aparelho.*;


public class Iphone {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int escolha1,escolha2;
		AparelhoTelefonico telefone=new SmartPhone();
		NavegarInternet internet=new SmartPhone();
		ReprodutoMusical musica=new SmartPhone();
		
		System.out.print("Digite o que você gostaria no momento \n1-Ir para o telefone"
				+ "\n2-Ir para a navegação \n3-Ouvir uma musica");
		escolha1=entrada.nextInt();
		
		if (escolha1==1) {
			System.out.println("Escolha a opção \n1-Ligar \n 2-Atender \n3-Entrar na Caixa postal");
			escolha2=entrada.nextInt();
			switch (escolha2) {
			case 1:
				telefone.ligar();
				break;
			case 2:
				telefone.atender();
				break;
			case 3:
				telefone.iniciarCorreioVoz();
				break;
			}
		}
		else if(escolha1==2) {
			System.out.println("1-Navegar \n2-Adicionar Aba \n3-Atualizar pagina ");
			escolha2=entrada.nextInt();
			switch (escolha2) {
			case 1:
				internet.exibirPagina(null);
				break;
			case 2:
				internet.AdicionarNovaAba();
				break;
			case 3:
				internet.atualizarPagina();
				break;
			}
		} else if(escolha1==3) {
			System.out.println("1-Ligar musica \n2-Selecionar musica \n3-Pausar");
			escolha2=entrada.nextInt();
			
			switch (escolha2) {
			case 1:
				musica.ligarMusica();
				break;
			case 2:
				musica.selecionarMusica(null);
				break;
			case 3:
				musica.pausar();
			
			}
		}
		entrada.close();
	}

}
