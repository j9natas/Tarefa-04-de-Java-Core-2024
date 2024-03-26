package continuação_das_tarefas;

import java.util.Scanner;


public class Tarefa_10 {

	
	
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Digite a quantidade de votos válidos para o candidato A:");
	        int votosA = scanner.nextInt();
	        System.out.println("Digite a quantidade de votos válidos para o candidato B:");
	        int votosB = scanner.nextInt();
	        System.out.println("Digite a quantidade de votos válidos para o candidato C:");
	        int votosC = scanner.nextInt();

	    
	        System.out.println("Digite a quantidade de votos nulos:");
	        int votosNulos = scanner.nextInt();
	        System.out.println("Digite a quantidade de votos em branco:");
	        int votosEmBranco = scanner.nextInt();

	     
	        int totalEleitores = votosA + votosB + votosC + votosNulos + votosEmBranco;

	        
	        double percentVotosValidos = ((double) (votosA + votosB + votosC) / totalEleitores) * 100;
	        double percentVotosA = ((double) votosA / totalEleitores) * 100;
	        double percentVotosB = ((double) votosB / totalEleitores) * 100;
	        double percentVotosC = ((double) votosC / totalEleitores) * 100;
	        double percentVotosNulos = ((double) votosNulos / totalEleitores) * 100;
	        double percentVotosEmBranco = ((double) votosEmBranco / totalEleitores) * 100;

	       
	        System.out.println("Número total de eleitores: " + totalEleitores);
	        System.out.println("Percentual de votos válidos: " + percentVotosValidos + "%");
	        System.out.println("Percentual de votos válidos para o candidato A: " + percentVotosA + "%");
	        System.out.println("Percentual de votos válidos para o candidato B: " + percentVotosB + "%");
	        System.out.println("Percentual de votos válidos para o candidato C: " + percentVotosC + "%");
	        System.out.println("Percentual de votos nulos: " + percentVotosNulos + "%");
	        System.out.println("Percentual de votos em branco: " + percentVotosEmBranco + "%");

	       
	        scanner.close();
	    }
		
	}
	

