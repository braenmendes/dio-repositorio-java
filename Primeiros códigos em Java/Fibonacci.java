//Programa imprime os 15 primeiros n�meros da sequ�ncia de Fibonacci

public class Fibonacci {
	
    public static void main(String[] args){
        int a =0;
        int b =1;
        int aux; // Vari�vel auxiliar para guardar valores

            for(int i =0; i<15; i++){ //La�o de repeti��o
                System.out.println(a); // Imprime o primeiro valor de a, que � zero na primeira passada.
                aux = a; //Vari�vel auxiliar recebe e guarda o valor de a, que � zero na primeira passada.
                a = a + b; // Novo a recebe o valor de a, que � zero + o valor de b, que � 1.
                           // Novo a agora � 1.
                b = aux;   // b agora � zero.
            }
    }// Fim do m�todo main

		
}// Fim da classe Fibonacci

	


