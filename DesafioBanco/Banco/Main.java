package Banco;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente=new Cliente();
		String nome,conta;
		int escolha;
		Double valor;
		
		String leiaNome= JOptionPane.showInputDialog("Digite o seu nome : ");
		nome=leiaNome;
		
		cliente.setNome(nome);
		
		String leiaConta=JOptionPane.showInputDialog("Qual o seu tipo de conta ? Conta corrente(CC) conta poupança(CP)");
		conta=leiaConta.toUpperCase();
		
		if (conta.equals("CC") ) {
			Conta cc=new ContaCorrente(cliente);
			String leiaEscolha=JOptionPane.showInputDialog(" Selecione a opção \n 1- Sacar \n 2-Depositar  \n 3-Ver Extrato  ");
			escolha = Integer.parseInt(leiaEscolha);
			
			switch (escolha) {
			case 1:
				String leiaValor=JOptionPane.showInputDialog("Valor R$ ");
				valor=Double.parseDouble(leiaValor);
			    if (valor < cc.getSaldo()) {
			    	JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
			    }
			    else {
			    	JOptionPane.showMessageDialog(null, "Realizado com sucesso");
			    }
				break;
				
				
			case 2:
				leiaValor=JOptionPane.showInputDialog("Valor para deposito R$ ");
				valor=Double.parseDouble(leiaValor);
				JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso ");
				break;
			case 3:
				cc.imprimirExtrato();
				
			}
		}
			if (conta.equals("CP") ) {
				Conta cp=new ContaPoupança(cliente);
			    String leiaEscolha=JOptionPane.showInputDialog(" Selecione a opção \n 1- Sacar \n 2-Depositar  \n 3-Ver Extrato  ");
				escolha = Integer.parseInt(leiaEscolha);
				
				switch (escolha) {
				case 1:
					String leiaValor=JOptionPane.showInputDialog("Valor R$ ");
					valor=Double.parseDouble(leiaValor);
				    if (valor < cp.getSaldo()) {
				    	JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
				    }
				    else {
				    	JOptionPane.showMessageDialog(null, "Realizado com sucesso");
				    }
					break;
					
					
				case 2:
					leiaValor=JOptionPane.showInputDialog("Valor para deposito R$ ");
					valor=Double.parseDouble(leiaValor);
					JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso ");
					break;
				case 3:
					cp.imprimirExtrato();
					
				}
			
			
			
				
			
			
		}
		
		
	
		 
		 
		 

	}

}
