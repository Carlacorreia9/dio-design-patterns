package strategy;

public class Carro implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo de carro");
    }
}