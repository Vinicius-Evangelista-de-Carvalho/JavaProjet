package sucessor;

import java.util.Scanner;

public class NumeroSucessor {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um número:");
		int numero = sc.nextInt();
		int resultado = numero+1;
		System.out.println("resultado é:"+resultado);
		sc.close();
		
	}

}
