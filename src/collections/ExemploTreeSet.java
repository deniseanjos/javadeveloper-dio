package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
	
	public static void main(String[] args) {
		
		 TreeSet<String> treeCapitais = new TreeSet<>();

	        // Monta a �rvore com as capitais
	        treeCapitais.add("Porto Alegre");
	        treeCapitais.add("Florian�polis");
	        treeCapitais.add("Curitiba");
	        treeCapitais.add("S�o Paulo");
	        treeCapitais.add("Rio de Janeiro");
	        //treeCapitais.add("Belo Horizonte");

	        //Impressao dos itens de forma ordenada, mas pode ser alterado
	        System.out.println(treeCapitais);

	        // Retorna a primeira capital no topo da �rvore
	        System.out.println("First: " + treeCapitais.first());

	        // Retorna a �ltima capital no final da �rvore
	        System.out.println("Last: " + treeCapitais.last());

	        // Retorna a primeira capital abaixo na �rvore da capital parametrizada
	        System.out.println("Lower Florianopolis: " + treeCapitais.lower("Florian�polis"));

	        // Retorna a primeira capital acima na �rvore da capital parametrizada
	        System.out.println("Higher Florianopolis: " + treeCapitais.higher("Florian�polis"));

	        // Exibe todas as capitais no console
	        System.out.println(treeCapitais);

	        // Retorna a primeira capital no topo da �rvore, removendo do set
	        System.out.println("Verificando e removendo primeiro item: " + treeCapitais.pollFirst());

	        // Retorna a primeira capital no final da �rvore, removendo do set
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
