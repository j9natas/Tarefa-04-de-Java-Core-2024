package continuação_das_tarefas;

import java.util.Scanner;

public class Tarefa_5 {

	
	public static void main(String[] Args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o Valor disponivel em Reais: ");
		float valorReal = sc.nextFloat();
		float conversaoDolar = valorReal / 5;

		System.out.println("O valor dos Reais, convertido em Dolar é: $ " + conversaoDolar);

		sc.close();

	}
	
	
	
	
}
