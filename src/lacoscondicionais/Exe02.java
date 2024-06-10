package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exe02 {

	//Faça um algoritmo em Java que leia 3 valores inteiros
			//A, B e C e imprima na tela se a soma de A + B é maior,
			//menor ou igual a C.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int a, b, c;

		System.out.print("\nDigite o Valor de A: ");
		a = sc.nextInt();

		System.out.print("\nDigite o Valor de B: ");
		b = sc.nextInt();

		System.out.print("\n Digite o Valor de C: ");
		c = sc.nextInt();

		sc.close();

		if (a + b > c ) {
			System.out.println("A Soma de A + B é maior do que C :)");
		}
		if (a + b < c) {
			System.out.println("A Soma de A + B é menor do que C :( ");
		}

	}

}