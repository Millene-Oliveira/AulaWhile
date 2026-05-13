package aulaWhile;

import java.util.Random;
import java.util.Scanner;

public class CavernaDoDragao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random destino = new Random();

		int direcao, destino2, vida = 3;

		System.out.println("Bem vindo à temível Caverna do Dragão!");
		System.out.println("Clique em qualquer tecla para continuar...");
		ler.next();

		while (vida > 0) {

			System.out.println("Escolha uma direção:(1- Esquerda / 2 - Direita / 3 - Frente");
			direcao = ler.nextInt();

			if (direcao >= 1 && direcao <= 3) {

				destino2 = destino.nextInt(5) + 1;

				if (destino2 == 1) {

					System.out.println("Uau! Você encontrou o tesouro!");
					System.out.println("Parabéns, você venceu!");

					vida = 0;

				} else if (destino2 == 2 || destino2 == 4) {

					vida--;

					System.out.println("Que pena! Você encontrou o dragão...");
					System.out.println("Vidas restantes: " + vida);

					if (vida == 0) {
						System.out.println("Sua jornada acaba por aqui...");
					}

				} else {

					System.out.println("Um caminho vazio!");
					System.out.println("Continue explorando a caverna...");
				}

			} else {

				System.out.println("Direção inválida!");
			}
		}

		ler.close();
	}
}
