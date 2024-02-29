package circulo;

import java.util.Scanner;

public class RaioCirculo {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a área do círculo: ");
	        float raio=sc.nextFloat();

	        double Resultado=raio *raio *Math.PI;

	        System.out.println("O raio do círculo é: " + Resultado);
	        sc.close();
	    }
	}
