package chain;

public class Gerente extends Aprovador {

    @Override
    public void aprovar(int valor) {
        System.out.println("Gerente aprovou");
    }
}