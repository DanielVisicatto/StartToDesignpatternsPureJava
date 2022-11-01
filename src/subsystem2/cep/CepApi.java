package subsystem2.cep;

/**
 * facade demonstração.
 *
 * @author Daniel Visicatto
 */

public class CepApi {
    private static  CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep){
        return "San Francisco";
    }

    public String getState(String cep){
        return "California";
    }
}
