public class Professor extends Pessoa {
    private String disciplina;
    private int quantidadeDeTurmas;

    public void falar() {
        System.out.println("Estou falando!");
    }

    public void realizarAvaliacaoFinal() {
        System.out.println("Realizando avaliacao final");
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
}
