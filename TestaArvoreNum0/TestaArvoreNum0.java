// Programa inicial que implementa uma arvore binaria de busca para inteiros
// Executa a entrada de dados, depois imprime o conteúdo da arvore e, por fim,
// solicita um valor a ser pesquisado, retornando msg indicando se foi ou nao
// encontrado na arvore.
// Os detalhes de implementacao da arvore estao contidos no package 
// ArvBinBuscaNum
import java.util.Scanner;
import arvbinbuscanum.ArvBinBuscaNum;

public class TestaArvoreNum0 {
	public static void main(String[] args) {
		ArvBinBuscaNum arv = new ArvBinBuscaNum();
		int valor;
		
		Scanner s = new Scanner(System.in);

		// Construindo a arvore com os valores informados
		while (true) {
			valor = s.nextInt();
		
			if (valor == -999)
				break;
		
			arv.insereNo(valor);
		}
		
		// Exibindo o conteúdo da arvore que foi gerada
		System.out.println("Conteúdo da arvore:");
		arv.imprimeArv(arv.getRaiz(), 0);
		// qtdeFolhas
		System.out.println("Quantidade de folhas: " + arv.qtdeFolha(arv.getRaiz()));
		// exibe em níveis(resolução 4):
		System.out.println("Em níveis: ");
		arv.imprimeNiveis(arv.getRaiz());
		
		// Pesquisando um valor na arvore
		System.out.println("Informe um valor para ser pesquisado na arvore:");
		valor = s.nextInt();
		if (arv.pesquisaValor(valor) != null)
			System.out.println("O valor " + valor + " foi encontrado na arvore");
		else
			System.out.println("O valor " + valor + " NaO EXISTE na arvore");
	}
}
