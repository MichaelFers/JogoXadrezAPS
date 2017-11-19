package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;
import MovimentoPeca.MovePeao;

public class Peao extends Peca{
	
	public Peao(int x, int y, Cor cor) {
		super(x, y, cor);
		super.movimento.add(new MovePeao());
		
	}
	@Override
	public void  iniciaImg() {
		
		if(cor.BRANCO == cor) {
			img = new ImageIcon("img/Brancas/Peao.jpg");
		}else {
			img = new ImageIcon("img/Escuras/Peao.jpg");
		}
			
		
	}

}
