package Jogador;

import java.util.ArrayList;
import java.util.List;

import Enum.Cor;
import Pecas.*;

public class Jogador {

	private String nome;
	private List<Peca> pecas;
	private Cor cor;
	private boolean vez;


	public Jogador(String nome, Cor cor) {
		pecas = new ArrayList();
		this.nome = nome;
		this.cor = cor;
		vez = true;
		addTodasAsPecas();
	}
	public boolean verificaSeExistePeca(int x, int y){

		for(Peca p: this.pecas){
			if(p.getX() == x && p.getY() == y){
				return true;
			}
		}

		return false;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void addPeca(Peca peca) {
		if(peca != null) {
			pecas.add(peca);
		}
	}
	public void addTodasAsPecas() {

		if(cor==null) {
			System.out.println("null");
		}
		if(cor==Cor.PRETO) {
			for(int x=0; x< 8;x++) {
				addPeca(new Peao(1,x,cor.PRETO));
			}
			addPeca(new Torre(0,0,cor.PRETO));
			addPeca(new Torre(0,7,cor.PRETO));
			addPeca(new Cavalo(0,1,cor.PRETO));
			addPeca(new Cavalo(0,6,cor.PRETO));
			addPeca(new Bispo(0,2,cor.PRETO));
			addPeca(new Bispo(0,5,cor.PRETO));
			addPeca(new Rainha(0,3,cor.PRETO));;
			addPeca(new Rei(0,4,cor.PRETO));
		}else {
			for(int x=0; x< 8;x++) {
				addPeca(new Peao(6,x,cor.BRANCO));
			}
			addPeca(new Torre(7,0,cor.BRANCO));
			addPeca(new Torre(7,7,cor.BRANCO));
			addPeca(new Cavalo(7,1,cor.BRANCO));
			addPeca(new Cavalo(7,6,cor.BRANCO));
			addPeca(new Bispo(7,2,cor.BRANCO));
			addPeca(new Bispo(7,5,cor.BRANCO));
			addPeca(new Rainha(7,3,cor.BRANCO));
			addPeca(new Rei(7,4,cor.BRANCO));
		}
	}
	public List<Peca> getPecas(){
		return pecas;
	}
	public Cor getCor() {
		return cor;
	}
	public void passaVez(){
		if(this.vez){
			this.vez = false;
		}else{
			this.vez = true;
		}
	}
	public void removePeca(int x, int y){
		for(Peca a: this.pecas){
			if(a.getX()== x && a.getY()==y){
				pecas.remove(a);
				break;
			}
		}
	}
	public Peca getPeca(int x, int y){
		for(Peca p: this.pecas){
			if(p.getX() == x && p.getY() == y){
				return p;
			}
		}
		return null;
	}

	public boolean getVez(){
		return this.vez;
	}
	public Peca getRei(){

		for(Peca p: this.pecas){
			if(p instanceof Rei){
				return p;
			}
		}
		return null;
	}

}
