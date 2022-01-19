
public class Filme {// classe
	
	public static int pontuarFilme(int script,int atuacao, int direcao) {// Método pontuarFilme
		return script + atuacao + direcao;
	}// Fim do método pontuarFilme

	public static void main(String arg[]) { // Método main
		int script =6, atuacao =9, direcao =8;
		System.out.print("A pontuação do filme é ");
		System.out.println(pontuarFilme(script,atuacao,direcao));
	}// Fim do método main
	
}// fim da classe filme
