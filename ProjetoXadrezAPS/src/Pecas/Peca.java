package Pecas;



import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import Enum.Cor;
import Excecoes.MovimentoNaoPermitido;
import MovimentoPeca.Movimento;
import Tabuleiro.Tabuleiro;

public abstract class Peca {
	
	private int x, y;
	protected Cor cor;
	protected ImageIcon img;
	protected List<Movimento> movimento;
	private Tabuleiro ta = new Tabuleiro();
	
	public Peca(int x, int y, Cor cor) {
		this.x = x;
		this.y = y;
		this.cor = cor;
		movimento = new ArrayList();
		iniciaImg();
	}
	
	
	
	public void moverPeca(int xAtual, int yAtual, int xNovo, int yNovo) throws MovimentoNaoPermitido{
		
		for(Movimento m: movimento) {
			if(m.mover(ta.getTabuleiro() , xAtual, yAtual,  xNovo,  yNovo)) {
				x= xNovo;
				y= yNovo;
				System.out.println("entrou no movePeca, movimento aceito");
			}else {
				System.out.println("entrou no else, movimento não aceito");
			}
		}
		
	}
	
	public abstract void iniciaImg();
	
	public  int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Cor getCor() {
		return cor;
	}
	public ImageIcon getImg() {
		return img;
	}
	

}
