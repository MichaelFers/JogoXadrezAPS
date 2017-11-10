package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;
import MovimentoPeca.MoveBispo;
import MovimentoPeca.MoveTorre;

public class Rainha extends Peca{

	public Rainha(int x, int y, Cor cor) {
		super(x, y, cor);
		super.movimento.add(new MoveBispo());
		super.movimento.add(new MoveTorre());
		
	}
	
	@Override
	public void iniciaImg() {
		if(cor.BRANCO == cor) {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Brancas/Rainha.jpg");
		}else {
			img = new ImageIcon("C:/Users/Michael Fernandes/eclipse-workspace/ProjetoXadrezAPS/img/Escuras/Rainha.jpg");
		}
		
	}

}
