package fundamentosAritmeticos;

import java.util.Scanner;

public class analiseNumeros {
	
	public static void main(String[] args) {
		
		//DESAFIO ANALISE DE NUMEROS
		
//		Scanner scan = new Scanner(System.in);
//		int valor = 0, positivo = 0, negativo = 0, impar = 0, par = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Entre com o " + (i + 1) + "º valor: ");
//			valor = scan.nextInt();
//			
//			if (valor > 0) {
//				positivo++;
//			} else {
//				negativo++;
//			}
//			
//			if(valor % 2 == 0) {
//				par++;
//			} else {
//				impar++;
//			}
//		}
//		
//		System.out.println(par + " valor(es) par(es)");
//        System.out.println(impar + " valor(es) impar(es)");
//        System.out.println(positivo + " valor(es) positivo(s)");
//        System.out.println(negativo + " valor(es) negativo(s)");
//        
//		System.out.printf("%d valor(es) par(es)\n"
//				+ "%d valor(es) impar(es)\n"
//				+ "%d valo(es) positivo(s)\n"
//				+ "%d valor(es) negativo(s)", par, impar, positivo, negativo);
        
	          Scanner leitor = new Scanner(System.in);

	          int numeros[] = new int[5];
	          for(int i = 0; i < numeros.length; i++){
	              numeros[i] = leitor.nextInt();
	          }

	          int par = 0;
	          int impar = 0;
	          int positivo = 0;
	          int negativo = 0;

	          for (int i=0;i<numeros.length;i++) {
	              if(numeros[i] % 2 == 0){
	                 par+=1;
	              }else{
	                 impar+=1;
	              }
	              if(numeros[i] < 0){
	                 negativo+=1;
	              }else if (numeros[i] > 0){
	                 positivo+=1;
	              }
	          }
	  //insira suas variaveis corretamente
	          System.out.println(par + " valor(es) par(es)");
	          System.out.println(impar + " valor(es) impar(es)");
	          System.out.println(positivo + " valor(es) positivo(s)");
	          System.out.println(negativo + " valor(es) negativo(s)");
	      }

}
