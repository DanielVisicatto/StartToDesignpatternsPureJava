package subsystem1.crm;

/**
 * facade demonstração.
 *
 * @author Daniel Visicatto
 */

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String city, String state){
        System.out.println("Client saved in CRM system: ");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
