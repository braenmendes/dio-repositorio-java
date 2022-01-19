
public class NumerosPerfeitos {

	public static void main(String[] args) {
		
		int[] vetorA = new int[4];
		int contador = 0, valor = 3, total = 0;
		System.out.print(" Os 4 primeiros números perfeitos são: ");

		
		for (int i = 2; i< valor; i = i+2) {
			for( int j =i; j > 0; j--) {
				if (j < i && i % j == 0) {
					total += j;
				}
			}
			if (total == i) {
				
				vetorA[ contador] = i;
				System.out.print( vetorA[ contador] + " ");
				contador++;
				if (contador < 4) {
					valor = valor + 2;
				}
			}else {
				valor = valor + 2;
				
			}
			total = 0;
		}
		

	}

}
