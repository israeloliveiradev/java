
package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int idade;
		int menor21 = 0;
		int maior50 = 0;

		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();

		while(idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();

			if(idade < 21) {
				menor21++;
			}
			if(idade > 50) {
				maior50++;
			}

		}
		sc.close();

		System.out.println("Laço Finalizado");
		System.out.printf("O total de pessoas menores de 21 anos foi %d \n", menor21);
		System.out.printf("O total de pessoas maiores de 50 anos foi %d\n", maior50);
	}
}