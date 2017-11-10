package MovimentoPeca;

import Pecas.Peca;
import Pecas.PecaVazia;

public class MoveTorre implements Movimento{

	
	
	@Override
	public boolean mover(Peca[][] t, int xAtual, int yAtual, int xPara, int yPara) {
		
		int x = xAtual;
		int y = yAtual;
		
		if(x>xPara && y==yPara){

			while(true){
				x--;
				if(t[x][y] instanceof PecaVazia){
					if(y==yPara && x==xPara){
						return true;
					}else{
						continue;
					}
				}else{
					if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor())) && x==xPara){

						return true;
					}
					return false;
				}
			}
		}
		if(x<xPara && y==yPara){

			while(true){
				x++;
				if(t[x][y] instanceof PecaVazia){
					if(y==yPara && x==xPara){

						return true;
					}else{
						continue;
					}
				}else{
					if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && x==xPara)){

						return true;
					}

					return false;
				}
			}
		}
		if(y>yPara && x==xPara){
			while(true){
				y--;
				if(t[x][y] instanceof PecaVazia){
					if(y==yPara && x==xPara){

						return true;
					}else{
						continue;
					}
				}else{
					if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && y==yPara)){

						return true;
					}

					return false;
				}
			}
		}
		if(y<yPara && x==xPara){

			while(true){
				y++;
				if(t[x][y] instanceof PecaVazia){
					if(y==yPara && x==xPara){

						return true;
					}else{
						continue;
					}
				}else{
					if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && y==yPara)){

						return true;
					}

					return false;
				}
			}
		}else{

			return false;
		}
	}

}
