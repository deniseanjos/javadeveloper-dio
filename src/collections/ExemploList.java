package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Andre");
		nomes.add("Maria");
		nomes.add("Jose");
		
		System.out.println(nomes); //Impressao da primeira lista 
		
		nomes.set(2,"Larissa"); // Altera��o de valor de acordo com a posi��o
		
		System.out.println(nomes); // Impressao da lista atualizada
		
		Collections.sort(nomes); // Ordena��o simples de texto - Ordem alfabetica
		
		System.out.println(nomes); // Impressao da lista ordenada
		
		nomes.remove(4); // Remo��o de informa��o de acordo com o indice informado
		
		System.out.println(nomes); // Impressao com remo��o de item
		
		String nome = nomes.get(1); // Criando uma variavel para inserir valor de acordo com indice do array
		
		System.out.println(nome); // Impressao da variavel
		
		//String nomeErro = nomes.get(-1); // Buscando um elemento que n�o existe
		
		//System.out.println(nomeErro); // Imprimindo erro
		
		int tamanho = nomes.size(); // Localizar o tamanho da lista
		
		System.out.println(tamanho); // Imprimir valor
		
		nomes.remove("Pedro"); // Remo�ao de item atrav�s do valor e n�o indice
		
		System.out.println(nomes.size()); // Impressao do novo tamanho diretamente pela formula, sem atribui��o de nova variavel
		
		System.out.println(nomes.contains("Teste")); // Retorna um boolean (true ou false) se o elemento existe na lista

		boolean temNome = nomes.contains("Jose"); // Estrutura completa para verificar se o elemento existe atraves de nova variavel
		
		System.out.println(temNome); // Impressao atraves da vaeriavel criada
		
		boolean listaVazia = nomes.isEmpty(); // Retorna boolean se a lista esta ou nao vazia atraves da nova variavel
		
		System.out.println(listaVazia); // Impressao da variavel criada anteriormente
		
		// nomes.clear(); // Met�do para limpar toda a lista - remove todos os elementos
		
		int posicao = nomes.indexOf("Andre"); // Identificar o indice de determinado elemento da lista, se n�o houver retorna -1
		
		System.out.println(posicao); // Impressao do indice
		
		// LA�O DE REPETI��O para impressao de todos os itens da lista no console
		
		for (String nomeItem : nomes) {
			System.out.println(nomeItem);
		}
		
		//Objeto Iterator para impressao dos itens atraves do while
		
		Iterator<String> iterator = nomes.iterator();
		
		while (iterator.hasNext()) { //Retorna boolean true ou false
			System.out.println("---> " + iterator.next()); // Imprime o pr�ximo item
		}
		
		nomes.addAll(nomes);
		
	}

}
