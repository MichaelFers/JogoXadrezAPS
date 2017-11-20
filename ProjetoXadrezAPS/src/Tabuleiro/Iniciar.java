package Tabuleiro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageConsumer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import About.Desenvolvedores;
import Enum.Cor;
import Excecoes.CorDaPecaNaoExiste;
import Jogador.Jogador;
import Pecas.Peca;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Iniciar extends JFrame implements ActionListener {

	private JPanel contentPane;
	JMenuBar menuBar;
	JMenu mnNewMenu;
	JMenuItem novoJogo;
	JMenuItem placar;
	JMenuItem about;
	JMenuItem sair; 
	ImageIcon img1;
	JButton btInicia; 
	ImageIcon img2;
	JLabel lbImg;



	public static void main(String[] args) {
		Iniciar frame = new Iniciar();
		frame.setVisible(true);
	}

	public Iniciar() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				int i = JOptionPane.showConfirmDialog(null ,"Deseja sair?", "Sair",JOptionPane.YES_NO_OPTION);
				if (i == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					repaint();
				}
			}
		});
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(400, 100, 589, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Jogo Xadrez");

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 573, 21);
		contentPane.add(menuBar);

		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		novoJogo = new JMenuItem("Novo Jogo");
		mnNewMenu.add(novoJogo);

		placar = new JMenuItem("Placar Partidas");
		mnNewMenu.add(placar);

		about = new JMenuItem("About");
		about.addActionListener(this);
		mnNewMenu.add(about);

		sair = new JMenuItem("Sair");
		menuBar.add(sair);
		sair.addActionListener(this);
		novoJogo.addActionListener(this);

		img1 = new ImageIcon(
				"img/start.jpg");

		btInicia = new JButton(img1);
		btInicia.setBounds(236, 159, 121, 87);
		btInicia.addActionListener(this);
		contentPane.add(btInicia);

		img2 = new ImageIcon(
				"img/telaInicial.jpg");

		lbImg = new JLabel(img2);
		lbImg.setBounds(0, 0, 566, 426);
		contentPane.add(lbImg);


	}

	public Jogador[] criarJogadores() throws CorDaPecaNaoExiste {
		Jogador[] jogadores = new Jogador[2];
		try {

			for (int x = 1; x < 3; x++) {

				Cor corEnum = null;
				if (x == 1) {
					String nome = JOptionPane.showInputDialog("Informe o nome do jogador " + x);
					String cor = JOptionPane.showInputDialog("Informe a cor que o jogador deseja.").toLowerCase();
					System.out.println(cor);
					boolean bo = !(cor.equals("preto") || cor.equals("branco"));
					System.out.println(bo);
					if((!(cor.equals("preto") || cor.equals("branco")))){
						throw new CorDaPecaNaoExiste(
								"Cor da peça informado inválido, apenas permitido: Branco ou Preto.");
					}else {
						jogadores[0] = new Jogador(nome, cor.equals("preto") ? Cor.PRETO : Cor.BRANCO);
					}
				} else {
					String nome2 = JOptionPane.showInputDialog("Informe o nome do jogador " + x);
					jogadores[1] = new Jogador(nome2, jogadores[0].getCor() == Cor.PRETO ? Cor.BRANCO : Cor.PRETO);
				}

			}
		} catch (CorDaPecaNaoExiste e) {
			JOptionPane.showMessageDialog(null, "Informe algo válido");
		}
		return jogadores;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(arg0.getSource() == btInicia || arg0.getSource() == novoJogo) {
			Jogador[] jogadores = null;
			TelaTabuleiro tela =null;
			try {

				jogadores = criarJogadores();//criarJogadoresAuto(); 
				tela = new TelaTabuleiro(jogadores[0], jogadores[1]);
				tela.setVisible(true);
				dispose();

			} catch (Exception  e) {
				JOptionPane.showMessageDialog(null, e.getMessage());

			}
		}if(arg0.getSource() == sair) {

			int i = JOptionPane.showConfirmDialog(null ,"Deseja sair?", "Sair",JOptionPane.YES_NO_OPTION);
			if (i == JOptionPane.YES_OPTION) {
				System.exit(0);
			} else {
				repaint();
			}
		}



		if(arg0.getSource() == about) {
			Desenvolvedores d = new Desenvolvedores();
			d.setVisible(true);
		}
	}
	public Jogador[] criarJogadoresAuto() {
		return new Jogador[]{new Jogador("Michael",Cor.BRANCO), new Jogador("Junior",Cor.PRETO)};
	}
}
