package retangulo;

import java.util.Scanner;

public class DimensaoRetangulo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o altura do retangulo:");
		double altura = sc.nextDouble();
		System.out.println("digite a base do retangulo:");
		double base = sc.nextDouble();
		double area = altura*base;
		System.out.println("área do retangulo é:"+area);
		sc.close();
		
	}
	
}
