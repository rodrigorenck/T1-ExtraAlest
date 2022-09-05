## Tipos Abstratos de Dados (TAD)

Um Tipo Abstrado de Dados (TAD) corresponde a uma abstração da estrutura de dados onde é possível implementar estruturas de dados não primitivas (e não disponíveis nas linguagens de programação).

A principal característica de um TAD é a separação entre conceito e implementalção. Ou seja, o TAD define os dados e as operações a serem suportadas, independentemente da implementação específica.

Exemplos de TADs:
* Listas Lineares
* Pilhas
* Filas
* Árvores
* etc...
    

## Listas Lineares 
Lista linear é um conjunto de elementos do mesmo tipo, denominado **nodo** agrupados através de uma relação linear, um após o outro. 
Exemplo: Lista de alunos e notas.

As listas lineares podem utilizar basicamente duas estratégias de implementação:
* Alocação estática (usando Array)
* Alocação dinâmica (encadeamento)


### Listas Lineares estáticas implementadas com array

Modelagem (definição) do TAD em java.

#### TAD para implementação da Lista
Especifica um conjunto de métodos que serão implementados.

* add(e): insere um elemento no final do array
* add(index, e): insere um elemento em determinada posição
(index) do array
* get(index)/set(index, e): get/set o elem. na posição index
* remove(e): remove o elemento do array
* isEmpty(): retorna true se o array não contém elementos
* size(): retorna o número de elementos armazenados no array
* capacity(): retorna o número de elementos alocados para o array
* contains(e): retorna true se o array contém o elemento
* indexOf(e): retorna a posição onde o elemento está no array
* clear(): remove todos os elementos do array

Interface em Java

    public interface ListTAD {
        public void add(int e ) ;
        public void add(int index , int element ) ;
        public int get(int index ) ;
        public void set(int index , int element ) ;
        public boolean remove(int e ) ;
        public boolean isEmpty () ;
        public int size () ;
        public int capacity () ;
        public boolean contains(int e ) ;
        public int indexOf (int e ) ;
        public void clear () ;
    }









