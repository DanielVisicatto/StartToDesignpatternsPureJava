package singleton;

/**
 * Singleton demonstração. (Lazy Holder)
 *
 * @author Daniel Visicatto
 *
 * @see <a href="http://stackoverflow.com/a/24018148">Ref. desse Silgleton</a>
 */
public class SingletonLazyHolder {

    //Uma classe dentro da classe que (segura) nossa instância. Só tem a função de encapsular essa instância.
    private static class InstanceHolder{
        //aqui dentro essa instância precisa ser pública pra poder acessar.
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    //mesmo construtor privado...
    private SingletonLazyHolder() {
        super();
    }

    //aqui só muda mesmo acessar antes a classe pra chegar na instância.
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
