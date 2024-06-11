package estruturadedados;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Exercic01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		int opcao = -1;
		String adicionar, retirar;

		Queue<String> fila = new LinkedList<String>();

		fila.add("Rebeca");
		fila.add("Israel");
		fila.add("Jorge");
		fila.add("Firmino");
		fila.add("Armando");



			System.out.println("************************************************");
			System.out.println("*                                              *");
			System.out.println("*       1 - Adicionar Cliente na Fila          *");
			System.out.println("*       2 - Listar todos os Cliente            *");
			System.out.println("*       3 - Retirar Cliente da Fila            *");
			System.out.println("*       0 - Sair                               *");
			System.out.println("*                                              *");
			System.out.println("************************************************");


			while (opcao != 0) {
			System.out.printf("\nEntre com a opção desejada: ");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				System.out.printf("\nNome: ");
				adicionar = input.next();
				System.out.printf("\n%s Adicionado a Lista de Clientes com sucesso :)", adicionar , fila.add(adicionar));
				System.out.printf("\n" + fila);
				break;

			case 2:
				System.out.printf("\nLista de Clientes: " + fila);
				break;

			case 3:

				if(fila.isEmpty()){
					System.out.println("A fila está vazia!");
					break;
				}

				System.out.printf("\nLista de Clientes \n" + fila);
				System.out.printf("\nDigite o Cliente desejado: ");
				retirar = input.next();
				if (fila.contains(retirar)) {
					System.out.printf("%s retirado da fila", retirar, fila.remove(retirar));

				}

				else {
					System.out.println("Cliente não encontrado!");
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção Invalida");

			}

		}

		input.close();
	}

}
