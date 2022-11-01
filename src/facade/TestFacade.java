package facade;

/**
 * facade demonstração.
 *
 * @author Daniel Visicatto
 */

public class TestFacade {
    public static void main(String[]args){
        Facade facade = new Facade();

        facade.clientMigrate("Daniel Visicatto", "94158-0002");
    }
}
