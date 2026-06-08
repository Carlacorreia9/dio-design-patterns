package chain;

public class TesteChain {

    public static void executar() {

        Analista analista = new Analista();
        Coordenador coordenador = new Coordenador();
        Gerente gerente = new Gerente();

        analista.setProximo(coordenador);
        coordenador.setProximo(gerente);

        analista.aprovar(800);
        analista.aprovar(3000);
        analista.aprovar(10000);

        System.out.println();
    }
}