package trapezio;

import java.util.Scanner;

public class DimensaoTrapezio {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a base maior do trápezio:");
		double base1 = sc.nextDouble();
		System.out.println("digite a base menor do trápezio:");
		double base2 = sc.nextDouble();
		System.out.println("digite a altura do trápezio:");
		double altura = sc.nextDouble();
		double area =(base1+base2)*altura/2;
		System.out.println("a área do trápezio é:"+area);
		sc.close();
		
	}
}


