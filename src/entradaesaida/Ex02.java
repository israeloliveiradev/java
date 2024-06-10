package entradaesaida;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, total;

		System.out.println("Digite a 1° Nota: ");
		n1 = sc.nextFloat();

		System.out.println("Digite a 2° Nota: ");
		n2 = sc.nextFloat();

		System.out.println("Digite a 3° Nota: ");
		n3 = sc.nextFloat();

		System.out.println("Digite a 4° Nota: ");
		n4 = sc.nextFloat();


		total = ((n1 + n2 + n3 + n4) / 4 );

		System.out.printf("A Média aritimética final é: %.1f ", total);

		sc.close();

	}

}