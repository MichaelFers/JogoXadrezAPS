package Pecas;

import javax.swing.ImageIcon;

import Enum.Cor;
import MovimentoPeca.MoveBispo;
import MovimentoPeca.MovePeao;
import MovimentoPeca.MoveTorre;

public class Peao extends Peca{
	boolean virouRainha = false;
	public Peao(int x, int y, Cor cor) {
		super(x, y, cor);
		super.movimento.add(new MovePeao());

	}
	@Override
	public void  iniciaImg() {
		verificaPeaoVirouRainha();
		if(virouRainha== false) {
			if(cor.BRANCO == cor) {
				img = new ImageIcon("img/Brancas/Peao.jpg");
			}else {
				img = new ImageIcon("img/Escuras/Peao.jpg");
			}
		}else {
			if(cor.BRANCO == cor) {
				img = new ImageIcon("img/Brancas/Rainha.jpg");
			}else {
				img = new ImageIcon("img/Escuras/Rainha.jpg");
			}
		}
	}
	public void verificaPeaoVirouRainha(){

		if((super.getCor()==Cor.BRANCO && super.getX()==0) || (super.getCor() ==Cor.PRETO && super.getX()==7)){
			this.virouRainha = true;
			this.movimento.clear();
			this.movimento.add(new MoveTorre());
			this.movimento.add(new MoveBispo());
		}
	}

}
