package Padroes;

import Enum.Cor;
import Pecas.*;

public class FactoryMethod {
	
	public Peca getPessoa(String nome, int x, int y, Cor cor) {
		if(nome.toLowerCase().equals("peao")) {
			return new Peao(x,y,cor);
		}if(nome.toLowerCase().equals("bispo")) {
			return new Bispo(x,y,cor);
		}if(nome.toLowerCase().equals("cavalo")) {
			return new Cavalo(x,y,cor);
		}if(nome.toLowerCase().equals("rei")) {
			return new Rei(x,y,cor);
		}if(nome.toLowerCase().equals("rainha")) {
			return new Rainha(x,y,cor);
		}if(nome.toLowerCase().equals("torre")) {
			return new Torre(x,y,cor);
		}else {
			return new PecaVazia(x,y,cor);
		}
	}
}
