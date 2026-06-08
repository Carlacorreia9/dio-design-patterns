package chain;

public class Coordenador extends Aprovador {

    @Override
    public void aprovar(int valor) {

        if (valor <= 5000) {
            System.out.println("Coordenador aprovou");
        } else {
            proximo.aprovar(valor);
        }
    }
}