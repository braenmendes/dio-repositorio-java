
public class Filme {// classe
	
	public static int pontuarFilme(int script,int atuacao, int direcao) {// M�todo pontuarFilme
		return script + atuacao + direcao;
	}// Fim do m�todo pontuarFilme

	public static void main(String arg[]) { // M�todo main
		int script =6, atuacao =9, direcao =8;
		System.out.print("A pontua��o do filme � ");
		System.out.println(pontuarFilme(script,atuacao,direcao));
	}// Fim do m�todo main
	
}// fim da classe filme
