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
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Brancas/Peao.jpg");
		}else {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Escuras/Peao.jpg");
		}
			
		
	}

}
