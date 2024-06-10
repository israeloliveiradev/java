package vetoresematrizes;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		// Scanner
		Scanner input = new Scanner(System.in);

		// CRIANDO MATRIZ VAZIA
		int matrizInteiros[][] = new int[3][3];
		int diagonalPrincipal = 0;
		int diagonalSecundaria = 0;
		// PREENCHIMENTO MATRIZ
		for (int index = 0; index < 3; index++) {
			for (int indexcol = 0; indexcol < 3; indexcol++) {
				System.out.println("Informe os valores: ");
				matrizInteiros[index][indexcol] = input.nextInt();
			}
		}

		// APRESENTAÇÃO MATRIZ
		for (int index = 0; index < 3; index++) {
			for (int indexcol = 0; indexcol < 3; indexcol++) {
				System.out.print("[" + matrizInteiros[index][indexcol] + "]");
			}
			System.out.println("\n");
		}
		// SOMA DIAGONAL PRINCIPAL e SECUNDARIA
		for (int index = 0; index < 3; index++) {
			for (int indexcol = 0; indexcol < 3; indexcol++) {
				if (index == indexcol) {
					diagonalPrincipal += matrizInteiros[index][indexcol];
				}
				if (index + indexcol == 2) {
					diagonalSecundaria += matrizInteiros[index][indexcol];

				}
			}

		}
		System.out.println("\nElementos da Diagonal Principal: ");
		for(int index = 0; index < 3; index++) {
			System.out.printf(matrizInteiros[index][index] + " ");
		}
		System.out.println("\nElementos da Diagonal Secundaria: ");
		for(int index = 0; index < 3; index++) {
			System.out.print(matrizInteiros[index][2 - index] + " ");
		}

		System.out.printf("\nA soma da diagonal principal é:  %d", diagonalPrincipal);
		System.out.printf("\nA soma da diagonal secundaria é: %d", diagonalSecundaria);

		input.close();

	}

}
