package Tabuleiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Excecoes.MovimentoNaoPermitido;
import Jogador.Jogador;
import Pecas.Peca;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaTabuleiro extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton[][] botoes = new JButton[8][8];
	private Tabuleiro t;
	private int x = -1, y = -1;

	public TelaTabuleiro(Jogador um, Jogador dois) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(400, 50, 773, 577);
		setTitle("Jogo Xadrez");
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeJogador = new JLabel("Nome jogador:");
		lblNomeJogador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeJogador.setBounds(560, 125, 86, 14);
		contentPane.add(lblNomeJogador);
		
		JLabel lbJogador = new JLabel(um.getNome());
		lbJogador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbJogador.setBounds(656, 125, 91, 14);
		contentPane.add(lbJogador);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblX.setBounds(625, 170, 15, 14);
		contentPane.add(lblX);
		
		JLabel lblNewLabel = new JLabel("Nome Jogador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(560, 196, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbJogador2 = new JLabel(dois.getNome());
		lbJogador2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbJogador2.setBounds(656, 196, 91, 14);
		contentPane.add(lbJogador2);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCor.setBounds(560, 150, 46, 14);
		contentPane.add(lblCor);
		
		JLabel lbCorJ1 = new JLabel(um.getCor().toString());
		lbCorJ1.setBounds(656, 150, 66, 14);
		contentPane.add(lbCorJ1);
		
		JLabel lblCor_1 = new JLabel("Cor:");
		lblCor_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCor_1.setBounds(560, 221, 46, 14);
		contentPane.add(lblCor_1);
		
		JLabel lbCorJ2 = new JLabel(dois.getCor().toString());
		lbCorJ2.setBounds(656, 221, 66, 14);
		contentPane.add(lbCorJ2);
		
		JLabel jogadorDaVez = new JLabel("Nome do Jogador da vez");
		jogadorDaVez.setFont(new Font("Tahoma", Font.BOLD, 11));
		jogadorDaVez.setBounds(560, 292, 162, 14);
		contentPane.add(jogadorDaVez);
		
		JLabel nomeJogadorDaVez = new JLabel("");
		nomeJogadorDaVez.setBounds(572, 329, 116, 14);
		contentPane.add(nomeJogadorDaVez);
		
		JLabel msgTempo = new JLabel("Tempo");
		msgTempo.setFont(new Font("Tahoma", Font.BOLD, 11));
		msgTempo.setBounds(603, 354, 66, 14);
		contentPane.add(msgTempo);
		
		JLabel tempo = new JLabel("");
		tempo.setBounds(600, 405, 46, 14);
		contentPane.add(tempo);
		t = new Tabuleiro(um,dois);
		criarBotoes();
		
	}
	
	public void attImg() {
		Peca[][] p = t.getTabuleiro();
		for(int x=0; x< botoes.length;x++ ) {

			for(int y=0; y<botoes[x].length; y++) {
				botoes[x][y].setIcon(p[x][y].getImg());
			}
		}
	}
	

	public void criarBotoes() {
		
		Peca[][] p = t.getTabuleiro();
		for(int x=0; x< botoes.length;x++ ) {

			for(int y=0; y<botoes[x].length; y++) {
				
				botoes[x][y] = new JButton(p[x][y].getImg());
			
		
				if(x==0 && y==0) {
					botoes[x][y].setBounds(30, 34, 64, 63);
				}if(x==0 && y==1) {
					botoes[x][y].setBounds(92, 34, 64, 63);
				}if(x==0 && y==2) {
					botoes[x][y].setBounds(155, 34, 64, 63);
				}if(x==0 && y==3) {
					botoes[x][y].setBounds(218, 34, 64, 63);
				}if(x==0 && y==4) {
					botoes[x][y].setBounds(281, 34, 64, 63);
				}if(x==0 && y==5) {
					botoes[x][y].setBounds(344, 34, 64, 63);
				}if(x==0 && y==6) {
					botoes[x][y].setBounds(408, 34, 64, 63);
				}if(x==0 && y==7) {
					botoes[x][y].setBounds(471, 34, 64, 63);
				}if(x==1 && y==0) {
					botoes[x][y].setBounds(30, 95, 64, 63);
				}if(x==1 && y==1) {
					botoes[x][y].setBounds(92, 95, 64, 63);
				}if(x==1 && y==2) {
					botoes[x][y].setBounds(155, 95, 64, 63);
				}if(x==1 && y==3) {
					botoes[x][y].setBounds(218, 95, 64, 63);
				}if(x==1 && y==4) {
					botoes[x][y].setBounds(281, 95, 64, 63);
				}if(x==1 && y==5) {
					botoes[x][y].setBounds(344, 95, 64, 63);
				}if(x==1 && y==6) {
					botoes[x][y].setBounds(408, 95, 64, 63);
				}if(x==1 && y==7) {
					botoes[x][y].setBounds(471, 95, 64, 63);
				}if(x==2 && y==0) {
					botoes[x][y].setBounds(30, 157, 64, 63);
				}if(x==2 && y==1) {
					botoes[x][y].setBounds(92, 157, 64, 63);
				}if(x==2 && y==2) {
					botoes[x][y].setBounds(155, 157, 64, 63);
				}if(x==2 && y==3) {
					botoes[x][y].setBounds(218, 157, 64, 63);
				}if(x==2 && y==4) {
					botoes[x][y].setBounds(281, 157, 64, 63);
				}if(x==2 && y==5) {
					botoes[x][y].setBounds(344, 157, 64, 63);
				}if(x==2 && y==6) {
					botoes[x][y].setBounds(408, 157, 64, 63);
				}if(x==2 && y==7) {
					botoes[x][y].setBounds(471, 157, 64, 63);
				}if(x==3 && y==0) {
					botoes[x][y].setBounds(30, 218, 64, 63);
				}if(x==3 && y==1) {
					botoes[x][y].setBounds(92, 218, 64, 63);
				}if(x==3 && y==2) {
					botoes[x][y].setBounds(155, 218, 64, 63);
				}if(x==3 && y==3) {
					botoes[x][y].setBounds(218, 218, 64, 63);
				}if(x==3 && y==4) {
					botoes[x][y].setBounds(281, 218, 64, 63);
				}if(x==3 && y==5) {
					botoes[x][y].setBounds(344, 218, 64, 63);
				}if(x==3 && y==6) {
					botoes[x][y].setBounds(408, 218, 64, 63);
				}if(x==3 && y==7) {
					botoes[x][y].setBounds(471, 218, 64, 63);
				}if(x==4 && y==0) {
					botoes[x][y].setBounds(30, 281, 64, 63);
				}if(x==4 && y==1) {
					botoes[x][y].setBounds(92, 281, 64, 63);
				}if(x==4 && y==2) {
					botoes[x][y].setBounds(155, 281, 64, 63);
				}if(x==4 && y==3) {
					botoes[x][y].setBounds(218, 281, 64, 63);
				}if(x==4 && y==4) {
					botoes[x][y].setBounds(281, 281, 64, 63);
				}if(x==4 && y==5) {
					botoes[x][y].setBounds(344, 281, 64, 63);
				}if(x==4 && y==6) {
					botoes[x][y].setBounds(408, 281, 64, 63);
				}if(x==4 && y==7) {
					botoes[x][y].setBounds(471, 281, 64, 63);
				}if(x==5 && y==0) {
					botoes[x][y].setBounds(30, 342, 64, 63);
				}if(x==5 && y==1) {
					botoes[x][y].setBounds(92, 342, 64, 63);
				}if(x==5 && y == 2) {
					botoes[x][y].setBounds(155, 342, 64, 63);
				}if(x==5 && y == 3) {
					botoes[x][y].setBounds(218, 342, 64, 63);
				}if(x==5 && y == 4) {
					botoes[x][y].setBounds(281, 342, 64, 63);
				}if(x==5 && y == 5) {
					botoes[x][y].setBounds(344, 342, 64, 63);
				}if(x==5 && y == 6) {
					botoes[x][y].setBounds(408, 342, 64, 63);
				}if(x==5 && y == 7) {
					botoes[x][y].setBounds(471, 342, 64, 63);
				}if(x==6 && y == 0) {
					botoes[x][y].setBounds(30, 403, 64, 63);
				}if(x==6 && y == 1) {
					botoes[x][y].setBounds(92, 403, 64, 63);
				}if(x==6 && y == 2) {
					botoes[x][y].setBounds(155, 403, 64, 63);
				}if(x==6 && y == 3) {
					botoes[x][y].setBounds(218, 403, 64, 63);
				}if(x==6 && y == 4) {
					botoes[x][y].setBounds(281, 403, 64, 63);
				}if(x==6 && y == 5) {
					botoes[x][y].setBounds(344, 403, 64, 63);
				}if(x==6 && y == 6) {
					botoes[x][y].setBounds(408, 403, 64, 63);
				}if(x==6 && y == 7) {
					botoes[x][y].setBounds(471, 403, 64, 63);
				}if(x==7 && y == 0) {
					botoes[x][y].setBounds(30, 464, 64, 63);
				}if(x==7 && y == 1) {
					botoes[x][y].setBounds(92, 464, 64, 63);
				}if(x==7 && y == 2) {
					botoes[x][y].setBounds(155, 464, 64, 63);
				}if(x==7 && y == 3) {
					botoes[x][y].setBounds(218, 464, 64, 63);
				}if(x==7 && y == 4) {
					botoes[x][y].setBounds(281, 464, 64, 63);
				}if(x==7 && y == 5) {
					botoes[x][y].setBounds(344, 464, 64, 63);
				}if(x==7 && y == 6) {
					botoes[x][y].setBounds(408, 464, 64, 63);
				}if(x==7 && y == 7) {
					botoes[x][y].setBounds(471, 464, 64, 63);
				}
				contentPane.add(botoes[x][y]);
				botoes[x][y].addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x == -1 && y == -1) {
			for(int x=0; x< botoes.length;x++ ) {

				for(int y=0; y<botoes[x].length; y++) {
					if(e.getSource() == botoes[x][y]) {
						this.x = x;
						this.y = y;
					}
				}
			}
		}else {
			for(int x=0; x< botoes.length;x++ ) {

				for(int y=0; y<botoes[x].length; y++) {
					if(e.getSource() == botoes[x][y]) {
						
						try {
							t.getPeca(this.x, this.y).moverPeca(this.x, this.y, x, y);
							t.getTabuleiro()[this.x][this.y] = null;
							this.x = x;
							this.y = y;
							t.atualizaTabuleiro();
							attImg();
							
						} catch (MovimentoNaoPermitido e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Clicou no bot�o");
	}
}
