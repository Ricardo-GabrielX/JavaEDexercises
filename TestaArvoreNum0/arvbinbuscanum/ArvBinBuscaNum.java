//
//	Classe para Arvore Binaria de Busca de números (inteiros)
//
package arvbinbuscanum;

import java.util.LinkedList;
import java.util.Queue;

public class ArvBinBuscaNum {
	public class No {
	// Classe que define a estrutura e operacoes basicas de um no de arvore
	// binaria capaz de armazenar um número do tipo int
		int valor;
		No esq;
		No dir;

		public No(int v) {
		// Construtor da classe, o no criado sera uma folha com o valor
		// recebido
			this.valor = v;
			this.esq = null;
			this.dir = null;
		}

		public void setValor(int v) {
		// Atribui o valor v ao no referenciado
			this.valor = v;
		}
		
		public int getValor() {
		// Retorna o inteiro armazenado no no referenciado
			return this.valor;
		}
	
		public void setRef(int lado, No p) {
		// Atribui a referencia p (que e um endereco de memoria) ao ponteiro
		// para a subarvore da esquerda (se lado == 0) ou da direita (se 
		// lado == 1)
			if (lado == 0)
				this.esq = p;
			else
				this.dir = p;
		}
		
		public No getRef(int lado) {
		// Retorna a referencia da subarvore da esquerda do no (se lado == 0)
		// ou da subarvore da direita (se lado == 1)
			if (lado == 0)
				return this.esq;
		
			return this.dir;
		}

		public boolean equals(Object o) {
		// Compara o conteudo util de dois nos, retornando true se forem
		// identicos e false em caso contrario
			No outro = (No) o;
			return (this.valor == outro.valor);
		}
	}

	private No raiz;		// Armazenara o endereco da raiz geral da arvore

	public ArvBinBuscaNum() {
	// Construtor da classe ArvBinBuscaNum. Cria uma arvore vazia (raiz nula)
		this.raiz = null;
	}

	public No getRaiz() {
	// Retorna o conteudo da raiz geral da arvore (nulo ou o endereco do no raiz)
		return this.raiz;
	}

	public void setRaiz(No r){
	// Atribui o endereco de um no específico para ser a raiz geral da arvore
		this.raiz = r;
	}
		
	public boolean arvoreVazia(No r) {
	// Retorna false se a arvore nao contiver no algum e true em caso contrario
		return (r == null);
	}
	
	public boolean insereNo(int v) {
	// Insere um novo no na arvore
	// O novo no sera uma folha, com valor v
	
		// Instanciando um novo no na memoria
		No noh = new No(v);

		// Cuidando do encadeamento do novo no
		No pai = this.achaPaiIt(noh);
//		No pai = this.achaPaiRec(noh, this.getRaiz());

		if (pai == null)
			this.setRaiz(noh);
		else
			if (v <= pai.getValor())
				pai.setRef(0, noh);
			else
				pai.setRef(1, noh);
		
		return true;
	}
	
	private No achaPaiIt(No novoNo) {
	// Retorna a referencia do ancestral imediato do novo no. Caso a arvore
	// esteja vazia, retorna nulo. Executa o processamento de forma ITERATIVA
	// (dentro de um looping)
		No candidato = this.getRaiz();
		
		// Procurando o contato informado na lista
		while (candidato != null) {
			if (novoNo.getValor() <= candidato.getValor())
				if (candidato.getRef(0) == null)
					return candidato;
				else
					candidato = candidato.getRef(0);
			else
				if (candidato.getRef(1) == null)
					return candidato;
				else
					candidato = candidato.getRef(1);
		}

		// Se chegou ate aqui e pq a arvore esta vazia no momento
		return null;
	}
	
	private No achaPaiRec(No novoNo, No candidato) {
	// Retorna a referencia do ancestral imediato do novo no. Caso a arvore
	// esteja vazia, retorna nulo. Executa o processamento de forma RECURSIVA
	// (nao tem looping: a rotina chama a si mesma para prosseguir a busca)
		
		if (candidato == null)
			return null;
		else
			if (novoNo.getValor() <= candidato.getValor())
				if (candidato.getRef(0) == null)
					return candidato;
				else
					return achaPaiRec(novoNo, candidato.getRef(0));
			else
				if (candidato.getRef(1) == null)
					return candidato;
				else
					return achaPaiRec(novoNo, candidato.getRef(1));
	}	

	public void imprimeArv(No r, int nivel) {
	// Imprime o conteudo de uma arvore binaria, com a raiz alinhada no
	// lado esquerdo da tela. Conforme aumenta o nivel do no, seu valor e
	// impresso mais afastado do início da linha.
		if (r == null) {
			return;
		}

		// Fazendo o processamento do valor a imprimir
		
		// Ajustando o deslocamento horizontal na tela
		for (int i = 0; i < nivel; i++)
			System.out.printf("   ");


		// Processando as suas duas subarvores
		imprimeArv(r.getRef(0), nivel + 1);
		imprimeArv(r.getRef(1), nivel + 1);
		System.out.println(r.getValor());


	}
	
	public No pesquisaValor(int v) {
	// Rotina inicial para encaminhar a pesquisa. Necessaria apenas para o
	// caso da pesquisa recursiva. esta desta forma apenas para facilitar os
	// testes iniciais com as duas abordagens (iterativa e recursiva),
	// minimizando as alteracoes de codigo requeridas para testar
		return pesquisaValorIt(v);

//		No procurado = new No(v);
//		return pesquisaValorRec(procurado, this.getRaiz());	
	}
	
	public No pesquisaValorIt(int v) {
	// Pesquisa se um valor informado existe ou nao na arvore. Caso exista, 
	// retorna sua referencia, caso nao exista, retorna nulo. Faz a busca de
	// forma ITERATIVA (dentro de um looping)
		No procurado = new No(v);
		No atual = this.getRaiz();
		
		// Procurando o contato informado na lista
		while (atual != null) {
			if (atual.equals(procurado))
				return atual;
			else
				if (procurado.getValor() < atual.getValor()) 
					atual = atual.getRef(0);
				else
					atual = atual.getRef(1);
		}

		// Saiu do looping sem encontrar o valor procurado na lista
		return null;
	}

	public No pesquisaValorRec(No procurado, No atual) {
	// Pesquisa se um valor informado existe ou nao na arvore. Caso exista, 
	// retorna sua referencia, caso nao exista, retorna nulo. Faz a busca de
	// forma RECURSIVA (nao tem looping: a rotina chama a si mesma para 
	// prosseguir a busca)
	
		if (atual == null)	// arvore vazia
			return null;
		
		if (atual.equals(procurado))	// Valor foi encontrado
			return atual;
		else
			if (procurado.getValor() < atual.getValor())
				return pesquisaValorRec(procurado, atual.getRef(0));
			else
				return pesquisaValorRec(procurado, atual.getRef(1));
	}

	public int qtdeFolha(No r){
		if(r == null){
			return 0;
		}

		if(r.getRef(0)== null && r.getRef(1) == null) {
			return 1;
		}

		return qtdeFolha(r.getRef(0)) + qtdeFolha(r.getRef(1));
	}

	public void imprimeNiveis(No r){
		if(r == null) return;

		Queue<No> f = new LinkedList<>();
		No x;

		f.add(r);
		while(f.size() > 0) {
			x = f.poll();
			if(x.getRef(0) != null){
				f.add(x.getRef(0));
			}
			if(x.getRef(1) != null){
				f.add(x.getRef(1));
			}
			System.out.println(x.getValor());
		}

	}

	public int AlturaArvore(No r) {
		if (r == null) {
			return -1;
		}

		int alturaEsq =	AlturaArvore(r.getRef(0));
		int alturaDir =	AlturaArvore(r.getRef(1));

		return 1 + Math.max(alturaEsq, alturaDir);

	}
}
