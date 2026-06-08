import singleton.TesteSingleton;
import strategy.TesteStrategy;
import chain.TesteChain;

public class Main {

    public static void main(String[] args) {

        TesteSingleton.executar();

        TesteStrategy.executar();

        TesteChain.executar();
    }
}