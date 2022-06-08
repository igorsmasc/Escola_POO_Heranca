public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Pedro");
        aluno.setIdade(10);
        aluno.setCurso("Matematica");
        aluno.setMediaGeral(10);

        System.out.println("Nome aluno " + aluno.getNome());
        System.out.println("Idade aluno " + aluno.getIdade());
        System.out.println("Curso aluno " + aluno.getCurso());
        System.out.println("Media Geral aluno " + aluno.getMediaGeral());
        aluno.falar();


        Professor professora = new Professor();
        professora.setNome("Juliana");
        professora.setIdade(10);
        professora.setDisciplina("Matematica");
        professora.setQuantidadeDeTurmas(10);

        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Igor");
        faxineiro.setIdade(25);
        faxineiro.setBloco("B1");
        faxineiro.setStatusBloco(true);

    }
}
