package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;
import MovimentoPeca.MoveRei;

public class Rei extends Peca{
	

	public Rei(int x, int y, Cor cor) {
		super(x, y, cor);
		super.movimento.add(new MoveRei());
	}
	
	@Override
	public void iniciaImg() {
		if(cor.BRANCO == cor) {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Brancas/Rei.jpg");
		}else {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Escuras/Rei.jpg");
		}
		
	}

}
