package triangulo;

import java.util.Scanner;

public class DimensaoTriangulo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o altura do triangulo:");
		double altura = sc.nextDouble();
		System.out.println("digite a base do triangulo:");
		double base = sc.nextDouble();
		double area = altura*base/2;
		System.out.println("área do triangulo é:"+area);
		sc.close();
		
	}
}
