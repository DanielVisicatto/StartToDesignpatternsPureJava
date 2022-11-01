package strategy;

/**
 * strategy demonstração.
 *
 * @author Daniel Visicatto
 */

public class TestRobot {
    public static void main(String[] args){

        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();

        robot.setStrategy(normal);
        robot.move();
        robot.move();
        robot.setStrategy(defensive);
        robot.move();
        robot.move();
        robot.move();
        robot.setStrategy(aggressive);
        robot.move();
        robot.move();
        robot.move();
        robot.move();
    }
}
