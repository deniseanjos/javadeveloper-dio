package fundamentosAritmeticos;

import java.util.Scanner;

public class numerosPares {
	
	public static void main(String[] args) {
		
		//DESAFIO EXIBINDO NUMEROS PARES
		
		int numero = 0;
		
		Scanner scan = new Scanner(System.in);
	    numero = scan.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0 && i > 0) {
				System.out.println(i);
			}
		}
		
	}

}
