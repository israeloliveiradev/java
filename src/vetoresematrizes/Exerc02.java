package vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);


		int odd = 0;
		int even = 0;
		double average = 0;
		int sum = 0;
		int[] numbersList = new int[10];
		int index = 0;


		for (index = 0; index < numbersList.length; index++) {
			System.out.println("Digite um número inteiro: ");
			numbersList[index] = sc.nextInt();
			sum = sum + numbersList[index];
			average = (double) sum / 10;

			
		}

		for (index = 0; index < numbersList.length; index++) {
			if (numbersList[index] % 2 == 0)
				even++;
		}

		for (index = 0; index < numbersList.length; index++) {
			if (numbersList[index] % 2 == 1)
				odd++;

		}
		sc.close();


		System.out.printf("ELEMENTOS ÍMPARES NO ÍNDICE: %d \n", odd);
		System.out.printf("ELEMENTOS PARES NO ÍNDICE: %d \n", even);
		System.out.printf("RESULTADO DA SOMA DE TODOS OS ELEMENTOS: %d \n", sum);
		System.out.printf("RESULTADO DA MÉDIA DE TODOS OS ELEMENTOS: %.2f \n", average);



	}


}
