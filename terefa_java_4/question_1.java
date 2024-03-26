package atividades_4;


import java.util.Scanner;

public class question_1 {

	
	public  static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os quatro números inteiros:");
		
		  int A = scanner.nextInt();
		  int B = scanner.nextInt();
	      int C = scanner.nextInt();
	      int D = scanner.nextInt();
		
		
		
	        int somaAB = A + B;
	        int somaAC = A + C;
	        int somaAD = A + D;
	        int somaBC = B + C;
	        int somaBD = B + D;
	        int somaCD = C + D; 
	      
	      
	        int multAB = A * B;
	        int multAC = A * C;
	        int multAD = A * D;
	        int multBC = B * C;
	        int multBD = B * D;
	        int multCD = C * D;
		
	        
	        
	        
	        System.out.println("Resultados da adição:");
	        System.out.println("A + B = " + somaAB);
	        System.out.println("A + C = " + somaAC);
	        System.out.println("A + D = " + somaAD);
	        System.out.println("B + C = " + somaBC);
	        System.out.println("B + D = " + somaBD);
	        System.out.println("C + D = " + somaCD);
   
	        
	        
		
	        System.out.println("\nResultados da multiplicação:");
	        System.out.println("A * B = " + multAB);
	        System.out.println("A * C = " + multAC);
	        System.out.println("A * D = " + multAD);
	        System.out.println("B * C = " + multBC);
	        System.out.println("B * D = " + multBD);
	        System.out.println("C * D = " + multCD);

	        scanner.close();
	        
	        
	        
	        
	        
	}
	
	
	
}
