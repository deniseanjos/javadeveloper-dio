package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
	
	public static void main(String[] args) {
		
		Set<Double> notasAlunos = new HashSet<>();
		
		// Adicionar as notas no set
		notasAlunos.add(5.8);
		notasAlunos.add(7.5);
		notasAlunos.add(10.0);
		notasAlunos.add(9.0);
		notasAlunos.add(4.0);
		notasAlunos.add(3.8);
		notasAlunos.add(6.7);
		
		// Imprime sem ordenação
		System.out.println(notasAlunos); 
		
		//Remove nota do set
		notasAlunos.remove(7.5); 
		
		System.out.println(notasAlunos);
		
		//Retorna a quantidade de itens do set
		System.out.println(notasAlunos.size());
		
		//Navega em todos os itens do iterator
		Iterator<Double> notas = notasAlunos.iterator();
		
		while (notas.hasNext()) {
			System.out.println("While " + notas.next());
		}
		
		for (double nota: notasAlunos) {
			System.out.println("For " + nota);
		}
		
		//Limpando os itens do Set
		//notasAlunos.clear();
		
		//Retorna se esta vazio ou não
		System.out.println(notasAlunos.isEmpty());		
		
	}

}
