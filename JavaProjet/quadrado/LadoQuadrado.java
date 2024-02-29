package quadrado;

import java.util.Scanner;

public class LadoQuadrado {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o lado do quadrado:");
		double lado1 = sc.nextDouble();
		double area = 4* lado1;
		System.out.println("área do quadrado é:"+area);
		sc.close();
		
	}
}

