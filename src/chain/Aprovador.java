package chain;

public abstract class Aprovador {

    protected Aprovador proximo;

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public abstract void aprovar(int valor);
}