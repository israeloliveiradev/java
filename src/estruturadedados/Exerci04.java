package estruturadedados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Exerci04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);


		Set<Integer> listaNumeros = new HashSet<Integer>();

		for(int index = 0; index < 10; index++) {
			System.out.printf("\nDigite o %d° valor inteiro e não repitido: ", (index + 1));
			listaNumeros.add(input.nextInt());
		}
		input.close();

		System.out.printf("\nDADOS DO SET \n");

		Iterator<Integer> ilistaNumeros = listaNumeros.iterator();

		while(ilistaNumeros.hasNext()) {
			System.out.print(ilistaNumeros.next() + " ");
		}

	}

}
