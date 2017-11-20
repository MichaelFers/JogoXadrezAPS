package Gravador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravadorDePartida {
	FileReader fr;
	FileWriter fw;
	BufferedReader br;
	BufferedWriter bw;
	private final String nomeArquivo = "histórico Partida.txt";

	public GravadorDePartida() throws IOException {
		fw = new FileWriter(nomeArquivo);
		bw = new BufferedWriter(fw);
		fr = new FileReader(nomeArquivo);
		br = new BufferedReader(fr);
	}
	public void gravar(String text) throws IOException {

		bw.write(text);
	}
	public String ler() throws IOException {

		//List<String> l = new ArrayList();
		String recebido = null;
		do {
			recebido = br.readLine()+"\n";
			//l.add(recebido);
		}while(recebido !=null);
		return recebido;
	}
}
