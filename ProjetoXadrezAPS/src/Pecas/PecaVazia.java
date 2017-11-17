package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;

public class PecaVazia extends Peca{

	public PecaVazia(int x, int y, Cor cor) {
		super(x, y, cor);
		
	}

	@Override
	public void iniciaImg() {
		if(cor.BRANCO == cor) {
			
			img = new ImageIcon("img/Brancas/fundo.jpg");
		}else {
			img = new ImageIcon("img/Escuras/fundo.jpg");
		}
		
	}

}
