package Ejercicio3;

import java.util.Scanner;

public class Palindromo {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palabra = in.next();
		char palabraArray[] = palabra.toCharArray();
		boolean palindromo = true;
		for (int i = 0; i < palabraArray.length; i++) {
			if (palabraArray[i] == (palabraArray[palabraArray.length - 1])) {
				palabraArray[palabraArray.length - 1] -= 1;
				palindromo = true;
			} else {
				palindromo = false;
			}
		}
		if (palindromo = true) {
			System.out.println("Es palíndromo");
		} else if (palindromo = false) {
			System.out.println("No es palindromo");
		}
	}
}
