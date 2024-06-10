package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerci02 {

	public static void main(String[] args) {
		// Criando Collection Set

		Scanner sc = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();
		setNumeros.addAll(Arrays.asList(3, 40, 20, 25, 90, 14, 29, 38, 92, 36));
		int input = 0;


		System.out.println("Digite um número que deseja encontrar: ");
		input = sc.nextInt();

		if(setNumeros.contains(input)) {
			System.out.printf("\n O número %d foi encontrado", input);
		} else {
			System.out.printf("\nO número %d não foi encontrado", input);
		}

		sc.close();


	}

}
