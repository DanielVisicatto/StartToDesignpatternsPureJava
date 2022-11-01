package strategy;

/**
 * strategy demonstração.
 *
 * @author Daniel Visicatto
 */
public class Robot {
    private Behavior strategy;

    // nosso robô pode querer mudar de comportamento. Então método set;
    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }
    //Agora preciso garantir que nosso robô possa se mover de alguma forma.
    //Um método público que vai delegar o comportamento para nossa strategy;
    public void move(){
        strategy.move();
    }
    //nosso robô tem um atribude da interface, então podemos abusar do polimorfismo.
}
