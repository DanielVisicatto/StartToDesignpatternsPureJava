package strategy;

/**
 * strategy demonstração.
 *
 * @author Daniel Visicatto
 */
public class AggressiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("moving aggressively...");
    }
}
