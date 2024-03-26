package atividades_4;

import java.util.Scanner;

public class question_2 {

	
public  static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o comprimento da caixa:");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura da caixa:");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura da caixa:");
        double altura = scanner.nextDouble();
		
		
        
        double volume = calcularVolume(comprimento, largura, altura);
        System.out.println("O volume da caixa é: " + volume);

        scanner.close();
    }

    public static double calcularVolume(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;
    }
}
		
		
		
		
		
		
		

