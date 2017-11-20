package MovimentoPeca;

import Pecas.Peca;
import Pecas.PecaVazia;


public class MoveBispo implements Movimento{

	@Override
	public boolean mover(Peca[][] t, int xAtual, int yAtual, int xPara, int yPara) {
		int x = xAtual;
		int y = yAtual;

		if(xAtual<xPara && yAtual<yPara){

			while(true){
				y--;
				x--;
				try {
					if(t[x][y] instanceof PecaVazia){
						if(y==yPara && x==xPara){

							return true;
						}else{
							continue;
						}
					}else{
						if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && (y==yPara && x==xPara))){

							return true;
						}

						return false;
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					return false;
				}
			}
		}
		if(xAtual<xPara && yAtual>yPara){

			while(true){
				y++;
				x--;
				try {
					if(y>=0 && t[x][y] instanceof PecaVazia){
						if(y==yPara && x==xPara){

							return true;
						}else{
							continue;
						}
					}else{
						if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && (y==yPara && x==xPara))){

							return true;
						}

						return false;
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					return false;
				}

			}
		}
		if(xAtual>xPara && yAtual<yPara){

			while(true){
				y--;
				x++;
				if(x==-1 || y==-1) {
					return false;
				}
				try{
					if(t[x][y] instanceof PecaVazia){
						if(y==yPara && x==xPara){

							return true;
						}else{
							continue;
						}
					}else {
						if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && y==yPara && x==xPara)){

							return true;
						}else{

							return false;
						}

					}
				}catch (ArrayIndexOutOfBoundsException e) {
					return false;
				}

			}
		}
		if(xAtual>xPara && yAtual>yPara){

			while(true){
				y++;
				x++;
				try {
					if(t[x][y] instanceof PecaVazia){
						if(y==yPara && x==xPara){

							return true;
						}else{
							continue;
						}
					}else{
						if((!t[xAtual][yAtual].getCor().equals(t[xPara][yPara].getCor()) && (y==yPara && x==xPara))){

							return true;
						}else{

							return false;
						}
					}
				}catch (ArrayIndexOutOfBoundsException e) {
					return false;
				}


			}
		}else{

			return false;
		}
	}
}



