package estruturadedados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exerci03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		boolean encontrado = false;

		listaNumeros.addAll(Arrays.asList(2, 30, 70, 76, 88, 29, 32, 10, 40, 56));

		System.out.println("Digite o número que deseja achar: ");
		int search = input.nextInt();

		for (int index = 0; index < listaNumeros.size(); index++) {
			if (listaNumeros.get(index) == search) {
				encontrado = true;
				System.out.printf("\nO número %d foi encontrado na posição %d", search, index);
				break;
			}

		}
		if (!encontrado) {
			System.out.printf("\nO número %d não foi encontrado", search);
		}

		input.close();
	}
}
