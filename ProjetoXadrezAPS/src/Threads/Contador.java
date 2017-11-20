package Threads;

import javax.swing.JLabel;

public class Contador extends Thread{
	private int cont;
	private JLabel b;
	public Contador(JLabel b) {
		cont = 0;
		this.b = b;
	}
	@Override
	public void run() {

		for(int x=0; x<30;x++) {
			cont++;
			b.setText(""+cont);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public void resetaTempo() {
		cont = 0;
	}
	public int getContador() {
		return cont;
	}

}
