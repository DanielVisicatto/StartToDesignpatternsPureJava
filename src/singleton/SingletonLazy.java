package singleton;

/**
 * Singleton demonstração. (preguiçoso)
 *
 * @author Daniel Visicatto
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    // Esse construtor é privado, para que ninguém possa criar uma nova instância dele.
    private SingletonLazy() {
        super();
    }
    //Como garantir q essa instância seja exposta de alguma forma pra quem ta chamando?
    //Com um método público estático, que vai simplesmente retornar nossa instância.
    //Para isso devemos instanciar a mesma, se != de null;
    public static SingletonLazy getInstance(){
        if(instance == null) instance = new SingletonLazy();
        return instance;
    }
    //Este é o padrão de implementação de um Singleton (forma preguiçosa)

}
