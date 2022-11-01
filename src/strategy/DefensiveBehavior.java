package strategy;

/**
 * strategy demonstração.
 *
 * @author Daniel Visicatto
 */
public class DefensiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("moving defensively...");
    }
}
