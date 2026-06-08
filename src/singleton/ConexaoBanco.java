package singleton;

public class ConexaoBanco {

    private static ConexaoBanco instancia;

    private ConexaoBanco() {
    }

    public static ConexaoBanco getInstance() {

        if (instancia == null) {
            instancia = new ConexaoBanco();
        }

        return instancia;
    }
}