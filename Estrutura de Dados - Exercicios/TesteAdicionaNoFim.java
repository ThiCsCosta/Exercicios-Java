
public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("João");
        aluno2.setNome("José");
        aluno3.setNome("Josef");

        Vetor lista = new Vetor();
    
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        lista.adiciona(aluno3);
        
        System.out.println(lista);
    }

}
