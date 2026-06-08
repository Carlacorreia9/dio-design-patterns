package strategy;

public class Bicicleta implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo de bicicleta");
    }
}