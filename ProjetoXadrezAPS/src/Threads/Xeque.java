package Threads;

import java.util.List;

import javax.swing.JOptionPane;

import Excecoes.MovimentoNaoPermitido;
import Jogador.Jogador;
import Pecas.Peca;

public class Xeque extends Thread{
	Jogador um, dois;
	
	public Xeque(Jogador um, Jogador dois) {
		this.um = um;
		this.dois = dois;
	}
	
	@Override
	public void run() {
		
		while(true) {

			System.out.println("Thread em uso");
			try {
					Peca reiDois = dois.getRei();
					if(reiDois == null){
						JOptionPane.showMessageDialog(null, um.getNome()+": Xeque-Mate!");
					}

					for(Peca p: um.getPecas()){
						if(p.moverPeca(p.getX(), p.getY(), reiDois.getX(), reiDois.getY())){
							JOptionPane.showMessageDialog(null, um.getNome()+": Xeque!");
							
						}
					}
				
					Peca reiUm = um.getRei();
					if(reiUm == null){
						JOptionPane.showMessageDialog(null, dois.getNome()+": Xeque-Mate!");
						
					}
					
					for(Peca p: dois.getPecas()){

						if(p.moverPeca(p.getX(), p.getY(), reiDois.getX(), reiDois.getY())){
							JOptionPane.showMessageDialog(null, dois.getNome()+": Xeque!");
							break;
						}
					} 
			}	catch (MovimentoNaoPermitido e) {
				e.printStackTrace();
			}
			System.out.println("fim da Thread em uso");
		}
		
	}

}
