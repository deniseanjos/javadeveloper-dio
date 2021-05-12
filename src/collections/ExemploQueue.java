package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
	
	public static void main(String[] args) {
		
		// Trabalha apenas com o primeiro elemento, formato de lista
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		String proximoAtendimento = filaBanco.poll(); // Ver elemento e remove ele
		
		System.out.println("--- Proximo cliente a ser atendido: " + proximoAtendimento);
		
		System.out.println(filaBanco);
		
		String primeiroCliente = filaBanco.peek(); // Mostra apenas o primeiro elemento, sem remover ele, ou null caso nao possua
		
		System.out.println("--- Primeiro cliente da fila: " + primeiroCliente);
		
		System.out.println(filaBanco);
		
		//filaBanco.clear(); // Limpando a lista
		
		String primeiroClienteOuErro = filaBanco.element(); //Não pode ter uma fila vazia para ser chamado, então retorna erro
		
		System.out.println(primeiroClienteOuErro);
		
		//Laço de Repetição para impressão do Queue
		
		for (String cliente: filaBanco) {
			System.out.println("-> " + cliente);
		}
		
		//Metodo iterator para percorrer todos os itens
		
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		
		while (iteratorFilaBanco.hasNext()) {
			System.out.println("I-> " + iteratorFilaBanco.next());
		}
	
		System.out.println(filaBanco.size()); // Verificar tamanho
		
		System.out.println(filaBanco.isEmpty()); // Verificar se esta vazia, boolean
		
	}

}
