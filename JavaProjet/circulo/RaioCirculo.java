package circulo;

import java.util.Scanner;

public class RaioCirculo {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a área do círculo: ");
	        double area = sc.nextDouble();

	        double raio = Math.sqrt(area / Math.PI);

	        System.out.println("O raio do círculo é: " + raio);
	        sc.close();
	    }
	}
