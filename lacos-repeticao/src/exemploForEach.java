public class exemploForEach {
    public static void main(String[] args) throws Exception {
        // Definindo um array com o nome de três alunos
        String alunos [] = {"Ruan", "Marcos", "João"};

        // Laço de repetição for each que percorre o array a atualiza a variável [aluno] com o atual índice
        for (String aluno : alunos) {
            System.out.println("O aluno é: " + aluno);
        }
    }
}
