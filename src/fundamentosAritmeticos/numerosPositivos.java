package fundamentosAritmeticos;

import java.util.Scanner;

public class numerosPositivos {
	
	public static void main(String[] args) {
		
		//DESAFIO QUANTIDADE DE NUMEROS POSITIVOS
		
		Scanner scanner = new Scanner(System.in);
		
		double valor = 0;
		int valoresPositivos = 0;
		
		for (int i = 0; i< 6; i++) {
			System.out.print("Entre com o " + (i + 1) + "º valor: "); //Necessário comentar essa linha no envio pois da erro nos testes
			valor = scanner.nextDouble();
			
			if(valor > 0) {
				valoresPositivos++;
			}
		}
		
		System.out.println(valoresPositivos + " valores positivos");
		
	}

}
