public class Faxineiro extends Pessoa {
    private String bloco;
    private boolean statusBloco;

    public void falar() {
        System.out.println("Estou falando!");
    }

    public void limpar() {
        System.out.println("Estou limpando!");
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public boolean isStatusBloco() {
        return statusBloco;
    }

    public void setStatusBloco(boolean statusBloco) {
        this.statusBloco = statusBloco;
    }
}
