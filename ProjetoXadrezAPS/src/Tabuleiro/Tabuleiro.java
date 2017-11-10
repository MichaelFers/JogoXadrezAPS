package Tabuleiro;

import java.util.List;

import Enum.Cor;
import Jogador.Jogador;
import Pecas.Peca;
import Pecas.PecaVazia;

public class Tabuleiro {
	private static Peca[][] tabuleiro = new Peca[8][8];
	private Jogador um, dois;

	public Tabuleiro(Jogador um, Jogador dois) {
		this.um = um;
		this.dois = dois;
		atualizaTabuleiro();
	}

	public Tabuleiro() {
		
	}

	public void atualizaTabuleiro() {
		addPecas(um.getPecas());
		addPecas(dois.getPecas());
		for (int x = 0; x < tabuleiro.length; x++) {
			int d = (x + 1) % 2;
			for (int y = 0; y < tabuleiro[x].length; y++) {
				
				if (tabuleiro[x][y] == null) {
					int q = (y + 1) % 2;
					if (d == 1) {
						if (q == 0) {
							tabuleiro[x][y] = new PecaVazia(x, y, Cor.BRANCO);
						} else {
							tabuleiro[x][y] = new PecaVazia(x, y, Cor.PRETO);
						}
					} else {
						if (q == 0) {
							tabuleiro[x][y] = new PecaVazia(x, y, Cor.PRETO);
						} else {
							tabuleiro[x][y] = new PecaVazia(x, y, Cor.BRANCO);

						}
					}
				}
			}
		}
	}

	public Peca[][] getTabuleiro() {
		return tabuleiro;
	}
	public Peca getPeca(int x, int y) {
		return tabuleiro[x][y];
	}

	public Jogador getUm() {
		return um;
	}

	public void setUm(Jogador um) {
		this.um = um;
	}

	public Jogador getDois() {
		return dois;
	}

	public void setDois(Jogador dois) {
		this.dois = dois;
	}

	public void addPecas(List<Peca> pe) {

		for (Peca p : pe) {
			tabuleiro[p.getX()][p.getY()] = p;
		}

	}

}
