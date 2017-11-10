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
			
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Brancas/fundo.jpg");
		}else {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Escuras/fundo.jpg");
		}
		
	}

}
