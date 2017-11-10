package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;

public class Torre extends Peca{

	public Torre(int x, int y, Cor cor) {
		super(x, y, cor);
		
	}
	
	@Override
	public void iniciaImg() {
		if(cor.BRANCO == cor) {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Brancas/Torre.jpg");
		}else {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Escuras/Torre.jpg");
		}
		
	}

}
