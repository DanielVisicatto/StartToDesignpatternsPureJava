package facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

/**
 * facade demonstração.
 *
 * @author Daniel Visicatto
 */

public class Facade {
    //imagine que vc tem uma base de clientes, e vc deseja migrar pra uma nova ou incrementar a atual.
    //suponhamos que esses clientes tenham nome e CEP evc quer consumir uma API de CEP para que a partir desses
    //CEP que sua base já tem, ela complemente com o endereço completo.

    //para simular um subsistema externo vamos colocar até em um novo pacote separado.

    public void clientMigrate(String name, String cep){
        //nosso subsistema vai ajudar a pegar esses dados que não estão aqui. Cidade e Estado.
        //coloco o resultado da chamada de CepApi.getInstance().getCity(cep) e State dentro destas variáveis
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);

        //agora sim consigo usar o resultado da "API" que está nas variáveis city e state.
        CrmService.saveClient(name, cep, city,state);
    }

}
