import java.util.Arrays;


public class Vetor {

// Declarando um Array de Aluno com capacidade de 100.
    private Aluno[] alunos = new Aluno[100];
    private  int tamanho = 0;


    public void adiciona(Aluno aluno) {
        if (tamanho < alunos.length) {
            alunos[tamanho] = aluno;
            tamanho++;
        }
        else {
                alunos = Arrays.copyOf(alunos, alunos.length * 2);
                alunos[tamanho] = aluno;
                tamanho++;
        }

    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < tamanho; i ++){
            sb.append(alunos[i]);
            if (i < tamanho -1){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
