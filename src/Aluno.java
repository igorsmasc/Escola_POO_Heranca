public class Aluno extends Pessoa {
    private String curso;
    private double mediaGeral;

    public void estudar() {
        System.out.println("Estou estudando!");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}
