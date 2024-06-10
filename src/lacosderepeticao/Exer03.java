
package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int number, sum = 0;

		do {
			System.out.println("Digite um Número: ");
			number = sc.nextInt();

			if (number > 0) {

				sum = sum + number;
			}

		} while(number != 0);
			System.out.printf("A soma dos números positivos foi %d ", sum);
			sc.close();
		}

	}
