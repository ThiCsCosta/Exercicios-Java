
public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        AlunoVetor aluno1 = new AlunoVetor();
        AlunoVetor aluno2 = new AlunoVetor();
        AlunoVetor aluno3 = new AlunoVetor();

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
