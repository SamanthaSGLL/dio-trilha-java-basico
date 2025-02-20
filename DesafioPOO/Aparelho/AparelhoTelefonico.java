package DesafioPOO.Aparelho;

public interface AparelhoTelefonico {
	boolean atender=false;
	boolean correiovoz=false;
	
	public void ligar();
	public void atender();
	public void iniciarCorreioVoz();
}
