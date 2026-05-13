package aulaWhile;

import java.util.Scanner;

public class Gabarito {
	public static void main(String[] args) {
		int aluno = 0, acertos = 0, questao = 0;
		String resposta, disponibilidade, temAluno;
		Scanner ler = new Scanner(System.in);

		System.out.println("Deseja descobrir as respostas da prova?(sim/não)");
		disponibilidade = ler.next();
		while (disponibilidade.equals("sim")) {

			System.out.println("É a sua primeira vez por aqui?(sim/não)");
			temAluno = ler.next();
			aluno = temAluno.equals("sim") ? aluno + 1 : aluno;

			System.out.println("insira qual questão deseja saber a resposta");
			questao = ler.nextInt();
			System.out.println("insira qual a sua resposta(Digite em letra maiúscula)");
			resposta = ler.next();

			switch (questao) {
			case 1:
				if (resposta.equals("A")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era A");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 2:
				if (resposta.equals("B")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era B");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 3:
				if (resposta.equals("C")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era C");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 4:
				if (resposta.equals("D")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era 4");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 5:
				if (resposta.equals("E")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era E");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 6:
				if (resposta.equals("E")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era E");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 7:
				if (resposta.equals("D")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era D");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 8:
				if (resposta.equals("C")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era C");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 9:
				if (resposta.equals("B")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era B");
				}
				System.out.println("Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
				break;

			case 10:
				if (resposta.equals("A")) {
					System.out.println("Acertou!");
					acertos++;
				} else {
					System.out.println("Errou! A resposta era A");
				}
				System.out.println("Há outro aluno?");
				disponibilidade = ler.next();
				break;

			default:
				System.out.println("Resposta inválida. Deseja saber a nota de mais alguma questão?");
				disponibilidade = ler.next();
			}
		}
		ler.close();
		double media = (double) acertos / aluno;
		System.out.println("A média entre " + aluno + " aluno(s) foi " + media + ".");
	}
}
