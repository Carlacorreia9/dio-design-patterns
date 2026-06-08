package singleton;

public class TesteSingleton {

    public static void executar() {

        ConexaoBanco c1 = ConexaoBanco.getInstance();
        ConexaoBanco c2 = ConexaoBanco.getInstance();

        System.out.println("Singleton:");
        System.out.println(c1 == c2);
        System.out.println();
    }
}