package entradaesaida;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 // CASO DUAS PALAVRAS, A PRIMEIRA MINISCULA E A SEGUNDA PALAVRA COM A PRIMEIRA MAISCULA
		float salbruto, adicionalNot, valHora, valExtra, qntExtra, valNot, totalNot, totalDesc, totalSal;


		System.out.println("========================================\n"
				+ "JORNADA DE TRABALHO - 180H MENSAIS\n"
				+ "DESCONTO DE 7% EM CIMA DO SALÁRIO BRUTO\n"
				+ "ADICIONAL NOTURNO - ACRÉSCIMO 20% POR HORA\n"
				+ "============================================\n");


		System.out.println("Digite o seu Salário Bruto: ");
		salbruto = sc.nextFloat();

		System.out.println("Digite a Quantidade de Horas Extras Feitas: ");
		qntExtra = sc.nextFloat();

		System.out.println("Digite a Quantidade de Horas Noturnas Feitas: ");
		adicionalNot = sc.nextFloat();


		valHora = (salbruto/180);
		valExtra = (valHora * qntExtra);
		valNot = ((valHora * 20) / 100) + valHora;
		totalNot = (valNot * adicionalNot);
		totalDesc = ((salbruto * 7) / 100);
		totalSal = (salbruto + totalNot + valExtra - totalDesc);


		System.out.printf("SALÁRIO BRUTO: %.2f\n", salbruto);
		System.out.printf("VALOR DESCONTO: %.2f", totalDesc);
		System.out.printf("TOTAL HORAS EXTRAS: %.2f\n", valExtra);
		System.out.printf("TOTAL ADICIONAL NOTURNO: %.2f\n", totalNot);
		System.out.printf("SALÁRIO ATUALIZADO: %.2f\n", totalSal);


		sc.close();

	}

}