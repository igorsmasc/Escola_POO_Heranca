public abstract class Pessoa {
    private String nome;
    private int idade;

    public void falar() {
        System.out.println("Estou falando!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
