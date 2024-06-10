package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerci01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Criando ArrayList
		ArrayList<String> listaCores = new ArrayList<String>();


		// Adicionando Cores
		for (int index = 0; index < 5; index++) {
			System.out.printf("Digite a %d° cor: ", (index +1));
			listaCores.add(input.nextLine());
		}

		System.out.println("\nLISTA DE CORES \n");

		for(String cor : listaCores) {
			System.out.println(cor);
		}

		System.out.println("\nLISTA DE CORES ORDENADAS \n");

		Collections.sort(listaCores);

		for(String cor : listaCores) {
			System.out.println(cor);
		}

		input.close();







	}

}
