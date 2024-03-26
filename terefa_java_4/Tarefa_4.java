package continuação_das_tarefas;

import java.util.Scanner;

public class Tarefa_4 {

	
	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Valor  em Dolares: ");
		float valorDolar = sc.nextFloat();
		float conversaoReal = valorDolar * 5;

		System.out.println("O valor em dolar , convertido em reais é: R$ " + conversaoReal);

		sc.close();
	}
	
}

	

