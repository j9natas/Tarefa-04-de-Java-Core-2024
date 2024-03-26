package continuação_das_tarefas;

import java.util.Scanner;

public class Tarefa_9 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário mensal:");
		float salarioMensal = sc.nextFloat();

		System.out.println("Digite o valor da porcentagem de reajuste.");
		float porcetagemReajuste = sc.nextFloat();

		float novoSalario = salarioMensal / 100 * porcetagemReajuste + salarioMensal;

		System.out.println("Após o reajuste seu novo salário é de: R$" + novoSalario);
		sc.close();
	}
	
}

	
	
	
	
	

