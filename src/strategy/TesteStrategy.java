package strategy;

public class TesteStrategy {

    public static void executar() {

        Usuario usuario = new Usuario();

        usuario.setComportamento(new Carro());
        usuario.mover();

        usuario.setComportamento(new Bicicleta());
        usuario.mover();

        System.out.println();
    }
}