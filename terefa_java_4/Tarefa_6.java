package continuação_das_tarefas;


import java.util.Scanner;

public class Tarefa_6 {

	public static void main (String[]  Args ) {
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Digite valor de A:");
	int valorA = sc.nextInt();

	System.out.println("Digite valor de B:");
	int valorB = sc.nextInt();

	System.out.println("Digite valor de C:");
	int valorC = sc.nextInt();

	double resultado = Math.pow(valorA, 2) + Math.pow(valorB, 2) + Math.pow(valorC, 2);
	
	System.out.println("Resultado da soma dos quadrados: "+resultado);
	sc.close();
	
	
	
	
	
	
	
		

	
	}
	
	
	
	
}
