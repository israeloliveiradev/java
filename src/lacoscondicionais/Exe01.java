package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int opcao, qnt;
		double valor = 0;
		String produto = "";



		System.out.println(" =======  BARRACA DO TIO JÃO  =======");
		System.out.println("|                                    |");
		System.out.println("|    DIGITE 1 PARA CACHORRO QUENTE   |");
		System.out.println("|    DIGITE 2 PARA X-SALADA          |");
		System.out.println("|    DIGITE 3 PARA X-BACON           |");
		System.out.println("|    DIGITE 4 PARA BAURU             |");
		System.out.println("|    DIGITE 5 PARA REFRIGERANTE      |");
		System.out.println("|    DIGITE 6 PARA SUCO DE LARANJA   |");
		System.out.println("|                                    |");
		System.out.println("=====================================");
		opcao = sc.nextInt();

		System.out.println("DIGITE QUANTOS ITENS VOCÊ DESEJA: ");
		qnt = sc.nextInt();

		sc.close();


		switch(opcao) {

		case 1:
			produto = "Cachorro Quente";
			valor = 10.00;
			break;

		case 2:
			produto = "X-SALADA";
			valor = 13.50;
			break;

		case 3:
			produto = "X-BACON";
			valor = 17.50;
			break;

		case 4:
			produto = "BAURU";
			valor = 11.50;
			break;

		case 5:
			produto = "Refrigerante";
			valor = 7.00;
			break;

		case 6:
			produto = "Suco de Laranja";
			valor = 10.00;
			break;

		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			return;


		}

		double total = valor * qnt;

		System.out.printf("Você comprou %d %s(s). \nTotal: R$ %.2f\n", qnt, produto, total);





		}
	}