package collections;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
	
	public static void main(String[] args) {
		
		List<String> animais = new Vector<>();
		
		//Adicionando 4 animais no vector
		animais.add("Vaca");
		animais.add("Cachorro");
		animais.add("Gato");
		animais.add("Papagaio");
		
		System.out.println(animais); //Imprimir a primeira versão do vector
		
		//Altera o valor da posicao indicada no vetor
		animais.set(2, "Jegue");
		
		//Remove o valor de acordo com a posição indicada
		animais.remove(3);
		
		//Retorna o valor de acordo com o indice
		System.out.println(animais.get(1));
		
		//Navega pelos itens do vetor
		for(String bicho: animais) {
			System.out.println(bicho);
		}
		
	}

}
