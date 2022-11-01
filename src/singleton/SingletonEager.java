package singleton;

/**
 * Singleton demonstração. (correria)
 *
 * @author Daniel Visicatto
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    // mesmo construtor privado...
    private SingletonEager() {
        super();
    }
    //Em vez de fazer a verificação, ele logo na definição ja atribui a instância, como notamos acima;
    //E ai sim nosso método público.
    public static SingletonEager getInstance(){
        return instance;
    }
    //No momento que essa classe for chamada essa instância já é atribuída e pronta pra ser retornada.
}
