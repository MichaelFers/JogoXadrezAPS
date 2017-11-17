package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;
import MovimentoPeca.MoveBispo;

public class Bispo extends Peca {
	

	public Bispo(int x, int y, Cor cor) {
		super(x, y, cor);
		super.movimento.add(new MoveBispo());
		
	}

	@Override
	public void iniciaImg() {
		if(cor.BRANCO == cor) {
			img = new ImageIcon("img/Brancas/Bispo.jpg");
		}else {
			img = new ImageIcon("img/Escuras/Bispo.jpg");
		}
		
	}
}
