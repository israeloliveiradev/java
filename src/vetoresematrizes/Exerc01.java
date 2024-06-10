package vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] numbersList = { 2, 5, 1, 3, 7, 9, 10, 4, 6, 8 };
		int position = 0;
		int search;

		System.out.println("Digite um número de 1 a 10: ");
		search = sc.nextInt();

		for (int index = 0; index < numbersList.length; index++) {
			if (numbersList[index] == search) {
				position = index;
			}
		}

		if (position >= 0) {
			System.out.printf("O número %d foi encontrado na posição %d", search, position);
		} else {
			System.out.println("Número não encontrado");
		}

		sc.close();

	}

}