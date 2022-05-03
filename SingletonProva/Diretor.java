package SingletonProva;

public class Diretor {

    private String nome;
    private static Diretor instancia;

    public Diretor() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Diretor getInstancia() {
        if (instancia == null) {
            synchronized (Diretor.class) {
                if (instancia == null) {
                    instancia = new Diretor();
                }
            }
        }
        return instancia;
    }
}
