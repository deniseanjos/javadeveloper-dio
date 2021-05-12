package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
	
	public static void main(String[] args) {
		
		 TreeSet<String> treeCapitais = new TreeSet<>();

	        // Monta a árvore com as capitais
	        treeCapitais.add("Porto Alegre");
	        treeCapitais.add("Florianópolis");
	        treeCapitais.add("Curitiba");
	        treeCapitais.add("São Paulo");
	        treeCapitais.add("Rio de Janeiro");
	        //treeCapitais.add("Belo Horizonte");

	        //Impressao dos itens de forma ordenada, mas pode ser alterado
	        System.out.println(treeCapitais);

	        // Retorna a primeira capital no topo da árvore
	        System.out.println("First: " + treeCapitais.first());

	        // Retorna a última capital no final da árvore
	        System.out.println("Last: " + treeCapitais.last());

	        // Retorna a primeira capital abaixo na árvore da capital parametrizada
	        System.out.println("Lower Florianopolis: " + treeCapitais.lower("Florianópolis"));

	        // Retorna a primeira capital acima na árvore da capital parametrizada
	        System.out.println("Higher Florianopolis: " + treeCapitais.higher("Florianópolis"));

	        // Exibe todas as capitais no console
	        System.out.println(treeCapitais);

	        // Retorna a primeira capital no topo da árvore, removendo do set
	        System.out.println("Verificando e removendo primeiro item: " + treeCapitais.pollFirst());

	        // Retorna a primeira capital no final da árvore, removendo do set
	        System.out.println("Removendo o ultimo item: " + treeCapitais.pollLast());

	        // Exibe todas as capitais no console
	        System.out.println(treeCapitais);

	        // Navega em todos os itens do iterator
	        Iterator<String> iterator = treeCapitais.iterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        for (String capital: treeCapitais) {
	            System.out.println(capital);
	        }

	}

}
