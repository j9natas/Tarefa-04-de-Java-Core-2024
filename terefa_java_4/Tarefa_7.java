package continuação_das_tarefas;


import java.util.Scanner;


public class Tarefa_7 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor de A:");
		int valorA = sc.nextInt();

		System.out.println("Digite valor de B:");
		int valorB = sc.nextInt();

		System.out.println("Digite valor de C:");
		int valorC = sc.nextInt();

		double resultado = Math.pow((valorA+valorB+valorC), 2);
		
		System.out.println("Resultado do quadrado das somas: "+resultado);
		sc.close();
	}
	
}
	
	
	
	

