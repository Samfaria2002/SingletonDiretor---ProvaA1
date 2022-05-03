package SingletonProva;

public class DiretorMain {
    public static void main(String[] args) {
        
        Diretor singleton = Diretor.getInstancia();
        singleton.setNome("Samuel");
        System.out.println(singleton.getNome());

        
    }
}
