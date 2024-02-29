package losango;

import java.util.Scanner;

public class DimensaoLosango {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a diagonal maior:");
		double diagonal1 = sc.nextDouble();
		System.out.println("digite a diagonal menor:");
		double diagonal2 = sc.nextDouble();
		double area = diagonal1*diagonal2/2;
		System.out.println("área do losango é:"+area);
		sc.close();
		
	}
}


