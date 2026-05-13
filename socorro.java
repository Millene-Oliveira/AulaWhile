package aulaWhile;

import java.util.Scanner;

public class socorro {
	public static void main(String[] args) {
		int dragao = 3; 
		int passo = 0; 
		int tesouro = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (passo != dragao) {
			System.out.println("Digite 1 para Direita, 2 Para Esquerda e 3 para Frente ");
			passo = ler.nextInt();
			tesouro ++; 
		}
		ler.close();
		System.out.println("Você encontrou o Dragão!!! Perdeu !!!");
		System.out.println("Sua Pontuação é " + tesouro);
	}

}
