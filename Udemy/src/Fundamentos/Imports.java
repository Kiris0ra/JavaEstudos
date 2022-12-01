package Fundamentos;

import java.util.Scanner;

public class Imports {

	public static void main(String[] args) {
		// Imports: importa funcionalidades ao programa
		// EX: Scanner
		Scanner teclado = new Scanner(System.in);

		int idade;
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();

		System.out.println("Sua idade é: " + idade);

		teclado.close();

	}

}
