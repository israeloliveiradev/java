
package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);


		int numero1, numero2;


		System.out.println("============================================");
		System.out.println("=       JOGO DOS MÚLTIPLOS DE 3 E 5        =");
		System.out.println("============================================");
		System.out.println("=                                          =");
		System.out.println("=              INSTRUÇÕES:                 =");
		System.out.println("=                                          =");
		System.out.println("=  Digite dois números inteiros.           =");
		System.out.println("=  O segundo número precisa ser maior      =");
		System.out.println("=  que o primeiro.                         =");
		System.out.println("=  O jogo encontrará e exibirá os          =");
		System.out.println("=  múltiplos de 3 e 5 no intervalo         =");
		System.out.println("=  desses dois números.                    =");
		System.out.println("=                                          =");
		System.out.println("============================================");

		System.out.print("Digite o 1° Número: ");
		numero1 = sc.nextInt();

		System.out.print("Digite o 2° Número: ");
		numero2 = sc.nextInt();

		sc.close();
		if(numero1 > numero2) {
			System.out.println("Intervalo inválido!");
		}
		for(int i = numero1; i <= numero2; i++) {
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.printf("%d É múltiplo de 3 e 5\n", i);
			}


		}



	}

}
