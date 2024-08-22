public class exemploFor {
    public static void main(String[] args) {
        // Definindo um array com o nome de três alunos
        String alunos [] = {"Ruan", "Marcos", "João"};

        // Este método "for" percorre a lista [alunos] e enquanto a variável [x] for menor que o tamanho da lista [alunos.length],
        // o método acrescentará +1 a cada iteração
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno de índice " + x + " é " + alunos[x]);
        }
    }
}
