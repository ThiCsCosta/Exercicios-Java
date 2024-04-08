/**
 * Interface da Lista:
 * 1) Adiciona um dado elemento no fim da Lista.
 * 2) Adiciona um dado elemento em um dada posição.
 * 3) Pega o elemento de uma dada posição.
 * 4) Remove o elemento de uma dada posição.
 * 5) Verifica se um dado elemento está contido na Lista.
 * 6) Informa a quantidade de elementos da Lista.
  **/


public class Aluno {

// Criado o Atribuido  'nome' 
    private String nome;
    
// Criado os metódos GETTERs e SETTERs
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

// Criando o metódo toString para imprimir os alunos
    @Override
    public String toString() {
        return this.nome;
    }
    
/** Criando o metódo (boolean equals) que servirar para comparar dois objetos do tipo Aluno 
    (o critério de comparação será os nomes dos alunos)
**/
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Aluno)){
            return false;
        }

        Aluno outro = (Aluno) obj;
        return this.nome != null && this.nome.equals(outro.nome);
    }

}

