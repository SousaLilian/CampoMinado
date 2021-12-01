package br.com.lilian.cm;

import br.com.lilian.cm.modelo.Tabuleiro;
import br.com.lilian.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
