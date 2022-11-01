package strategy;
/**
* strategy demonstração.
 *
* @author Daniel Visicatto
*/
public class NormalBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("moving normally...");
    }

}
