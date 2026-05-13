package aulaWhile;

import java.util.Random;
import java.util.Scanner;

public class NumeroAdivinhacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random numSec = new Random();
		int numero, numSecreto, tentativas = 1;

		numSecreto = numSec.nextInt(10) + 1;

		System.out.println("Digite um número para adivinhar: ");
		numero = ler.nextInt();

		while (numero != numSecreto) {
			if (numero < numSecreto) {
				System.out.println("O número é maior! Tente novamente.");
				numero = ler.nextInt();
				tentativas++;
			} else {
				System.out.println("O número é menor! Tente novamente");
				numero = ler.nextInt();
				tentativas++;
			}
		}
		System.out.println("Párabens!! O número era " + numSecreto);
		System.out.println("Tentou " + tentativas + " vezes.");
		ler.close();
	}
}
