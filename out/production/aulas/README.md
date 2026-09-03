# ☕ Java & Estruturas de Dados (FATEC)

Repositório dedicado ao estudo, implementação e otimização de **Estruturas de Dados** e **Algoritmos** em Java. O foco deste projeto é demonstrar domínio de conceitos fundamentais da Ciência da Computação, como gerenciamento de memória, estruturas dinâmicas, recursão vs. iteração e análise de eficiência algorítmica.

---

## Destaques & Competências Aplicadas

- **Estruturas Não-Lineares & Árvores**: Implementação de Árvores Binárias de Busca (BST) com inserção, busca e percursos (abordagens iterativa e recursiva).
- **Estruturas Lineares**: Análise comparativa entre alocação contígua em memória (`ArrayList`) e alocação dinâmica encadeada (`LinkedList`).
- **Análise Assintótica & Otimização de Código**: Redução de complexidade de tempo de $O(n)$ para $O(\sqrt{n})$ através de raciocínio matemático e divisibilidade.
- **Boas Práticas & POO**: Encapsulamento, tipagem genérica (`Generics`), modularização e legibilidade de código.

---

## Organização do Repositório

| Módulo / Diretório | Estrutura / Assunto | Conceitos e Aplicações |
| :--- | :--- | :--- |
| [`binaryTree/`](./binaryTree) | **Árvore Binária** | Implementação orientada a objetos com nós/folhas e inserção ordenada. |
| [`TestaArvoreNum0/`](./TestaArvoreNum0) | **BST Avançada (Números)** | Árvore Binária de Busca completa com busca e inserção implementadas tanto de forma **iterativa** quanto **recursiva**, além de visualização hierárquica por níveis. |
| [`ListaEncadeada/`](./ListaEncadeada) | **Lista Encadeada** | Manipulação de listas ligadas dinâmicas, nós referenciados e modelagem de entidades (`Contato`). |
| [`ListContinuidade/`](./ListContinuidade) | **Lista Contígua** | Operações fundamentais em vetores dinâmicos indexados (`ArrayList`). |
| [`ListaEDEx04/`](./ListaEDEx04) | **Algoritmos & Lógica** | Soluções de lógica e otimização algorítmica: controle de fluxo (*FizzBuzz*) e teste de primalidade otimizado com redução drástica no total de avaliações. |
| [`ExPreProva2/`](./ExPreProva2) | **Exercícios Práticos** | Exercícios de fixação e processamento de dados sob restrições de memória/tamanho. |

---

## Destaques de Raciocínio Algorítmico

### 1. Otimização de Primalidade ($O(n) \rightarrow O(\sqrt{n})$)
No módulo `ListaEDEx04`, o algoritmo de verificação de números primos foi aprimorado para minimizar operações desnecessárias:
- **Redução do espaço de busca**: O laço itera apenas até $\lfloor\sqrt{n}\rfloor$, eliminando divisores redundantes.
- **Salto de números pares**: Após verificar a divisibilidade por 2, os testes avançam com passo 2 (`p += 2`), reduzindo o número total de comparações em mais de 90%.

### 2. Árvore Binária de Busca: Recursão vs. Iteração
No módulo `TestaArvoreNum0`, métodos essenciais como busca de nós e determinação de nós ancestrais (`achaPai`) contam com implementação dupla:
- **Abordagem Iterativa**: Otimização do uso da pilha de chamadas (*call stack*), ideal para performance e árvores profundas.
- **Abordagem Recursiva**: Código expressivo e declarativo, explorando a natureza recursiva inerente à estrutura de árvores.

---

## Como Executar

### Pré-requisitos
- **Java JDK** 11 ou superior (testado com OpenJDK / Oracle JDK).
- Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code) ou via terminal.

### Executando via Terminal
Para compilar e executar qualquer um dos módulos, navegue até a pasta correspondente:

```bash
# Exemplo: Teste de Árvore Binária
cd binaryTree
javac *.java
java binaryTree.TesteArvore

# Exemplo: Exercício de Otimização Algorítmica
cd ../ListaEDEx04/src
javac Exercicio3.java
java Exercicio3
```

---

## Autor

Desenvolvido por **Ricardo Gabriel** como parte dos estudos de Ciência da Computação / Análise e Desenvolvimento de Sistemas na **FATEC**.
