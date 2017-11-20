package Threads;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Excecoes.TempoExpiradoException;

public class Contador extends Thread{
	private int cont;
	private JLabel b;
	public Contador(JLabel b) {
		cont = 30;
		this.b = b;
	}
	@Override
	public void run() {

		while(cont > 0) {
			
			b.setText(""+cont);
			System.out.println(cont);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Erro de interrupção");
			}
			cont--;
		}
		JOptionPane.showMessageDialog(null, "Tempo Expirado, recomece o jogo.");
		System.exit(0);
	}
	public void resetaTempo() {
		cont = 30;
	}
	public int getContador() throws  TempoExpiradoException{	
			return cont;
	}

}
