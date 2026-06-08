package chain;

public class Analista extends Aprovador {

    @Override
    public void aprovar(int valor) {

        if (valor <= 1000) {
            System.out.println("Analista aprovou");
        } else {
            proximo.aprovar(valor);
        }
    }
}