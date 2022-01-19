//Programa imprime os 15 primeiros números da sequência de Fibonacci

public class Fibonacci {
	
    public static void main(String[] args){
        int a =0;
        int b =1;
        int aux; // Variável auxiliar para guardar valores

            for(int i =0; i<15; i++){ //Laço de repetição
                System.out.println(a); // Imprime o primeiro valor de a, que é zero na primeira passada.
                aux = a; //Variável auxiliar recebe e guarda o valor de a, que é zero na primeira passada.
                a = a + b; // Novo a recebe o valor de a, que é zero + o valor de b, que é 1.
                           // Novo a agora é 1.
                b = aux;   // b agora é zero.
            }
    }// Fim do método main

		
}// Fim da classe Fibonacci

	


