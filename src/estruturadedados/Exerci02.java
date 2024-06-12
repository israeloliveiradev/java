package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Exerci02 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		Scanner input = new Scanner(System.in);

		int opcao = -1;

		String adicionar;

		pilha.push("Pai Rico Pai Pobre");
		pilha.push("Essencialismo");
		pilha.push("Quem Pensa Enriquece");
		pilha.push("A Felicidade e Inutil");
		pilha.push("Arte da Guerra");

		System.out.println("************************************************");
		System.out.println("*                                              *");
		System.out.println("*       1 - Adicionar Cliente na Pilha         *");
		System.out.println("*       2 - Listar todos os Livros             *");
		System.out.println("*       3 - Retirar Livro da Pilha             *");
		System.out.println("*       0 - Sair                               *");
		System.out.println("*                                              *");
		System.out.println("************************************************");

		while (opcao != 0) {
			System.out.printf("\n Entre com a opção desejada: ");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:

				System.out.printf("\nDigite o nome do Livro: ");
				input.nextLine(); // SOLUÇÃO BUG
				adicionar = input.next();
				System.out.printf("%s Adicionado na Pilha com Sucesso", adicionar, pilha.push(adicionar));
				System.out.printf("\n");
				System.out.printf("\n " + pilha);
				break;

			case 2:
				System.out.println("Livros disponíveis \n" + pilha);
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				}
				System.out.printf("\n%s foi retirado da pilha com sucesso. ", pilha.peek(), pilha.pop());
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção Invalida!");


			}
		}

		input.close();

	}

}
