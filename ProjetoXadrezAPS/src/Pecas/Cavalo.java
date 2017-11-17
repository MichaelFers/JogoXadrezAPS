package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;
import MovimentoPeca.MoveCavalo;

public class Cavalo  extends Peca{
	

	public Cavalo(int x, int y, Cor cor) {
		super(x, y, cor);
		super.movimento.add(new MoveCavalo());
	}
	
	@Override
	public void iniciaImg() {
		if(cor.BRANCO == cor) {
			img = new ImageIcon("img/Brancas/Cavalo.jpg");
		}else {
			img = new ImageIcon("img/Escuras/Cavalo.jpg");
		}
		
	}

}
