package fundamentosAritmeticos;

import java.util.Scanner;

public class consumoMedio {

	public static void main(String[] args) {
		
		// DESAFIO CONSUMO MEDIO DO AUTOMOVEL
		
		   Scanner leitor = new Scanner(System.in);

	        //declare as variaveis corretamente

	        int distancia  = leitor.nextInt();
	        double combustivel = leitor.nextDouble();

	        double media = distancia / combustivel ;  //insira as variaveis de acordo com o enunciado
	        System.out.println(String.format("%.3f km/l",  media));   
	    }

}
