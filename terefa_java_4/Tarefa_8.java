package continuação_das_tarefas;


import java.util.Scanner;

public class Tarefa_8 {

	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A.");
		int valorA = sc.nextInt();

		System.out.println("Digite o valor de B.");
		int valorB = sc.nextInt();

		System.out.println("Digite o valor de C.");
		int valorC = sc.nextInt();

		System.out.println("Digite o valor de D.");
		int valorD = sc.nextInt();

		int resultadoProduto = valorA * valorC;

		int resultadoSoma = valorB + valorD;

		System.out.println("O Resultado do produto é : " + resultadoProduto);
		System.out.println("O Resultado da soma é : " + resultadoSoma);

		sc.close();
	}
	
}
		
		
		
		
		
