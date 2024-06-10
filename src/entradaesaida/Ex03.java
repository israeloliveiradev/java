package entradaesaida;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Setando System US
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		float sal, abo, res;

		System.out.println("Digite o Salário: ");
		sal = sc.nextFloat();

		System.out.println("Digite o valor do Abono:");
		abo = sc.nextFloat();

		res = (sal + abo);

		System.out.printf("\nO Novo Salário É: %.2f" , res);


		sc.close();
	}

}