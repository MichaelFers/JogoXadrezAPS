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
	
	
	
	public boolean moverPeca(int xAtual, int yAtual, int xNovo, int yNovo) throws MovimentoNaoPermitido{
		
		boolean permicao = false;
		
		for(Movimento m: movimento) {
			permicao = m.mover(ta.getTabuleiro() , xAtual, yAtual,  xNovo,  yNovo);
			if(permicao) {
				
				return true;
			}
		}
		
		return permicao;
		
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
		iniciaImg();
		return img;
	}
	public void setPosicao(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
