public class Blocof{
    private int idade;
    private Blocof prox;

    public Blocof(int idade) {
        this.idade = idade;
        this.prox = null;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Blocof getProx() {
        return prox;
    }
    public void setProx(Blocof prox) {
        this.prox = prox;
    }
    

}