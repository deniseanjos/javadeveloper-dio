package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		//Adiciona os numeros no set
		sequenciaNumerica.add(7);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(9);
		sequenciaNumerica.add(18);
		sequenciaNumerica.add(15);
		sequenciaNumerica.add(0);
		sequenciaNumerica.add(1);
		
		//Imprime na ordem de inserção 
		System.out.println(sequenciaNumerica);
		
		//Remove o numero do set
		sequenciaNumerica.remove(9);
		
		System.out.println(sequenciaNumerica);

		//Retorna a quantidade do set
		System.out.println(sequenciaNumerica.size());
		
		//Navega em todos itens do iterador
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("while -> " + iterator.next());
		}
		
		for (Integer numero : sequenciaNumerica) {
			System.out.println("for -> " + numero);
		}
		
		//Retorna se o set esta vazio boolean
		System.out.println(sequenciaNumerica.isEmpty());
	}

}
