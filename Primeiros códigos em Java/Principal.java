
public class Principal {

	public static void main(String[] args) {
		int script=6, atuacao=9, direcao=8;
		
		System.out.print("A pontua��o de um filme � ");
		System.out.println(Filme.pontuarFilme(script, atuacao, direcao));
		/* chama a classe filme com
		o m�todo pontuarFilmne*/
		System.out.print("A pontua��o do filme James Bond � ");
		System.out.println(JamesBondFilme.pontuarFilme(script, atuacao, direcao));
	}

}
