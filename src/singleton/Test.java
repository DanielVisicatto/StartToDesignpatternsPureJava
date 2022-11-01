package singleton;

public class Test {
    public static void main(String[] args){
        // Poderíamos instanciar cada um dos nossos singletons aqui e imprimir o endedeço de memória deles.
        // SingletonLazy lazy = new SingletonLazy(); assim não dá ! correto abaixo
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("End. mem. Lazy: "+ lazy);
        // de novo pra ver se está sendo a mesma instância.
        lazy = SingletonLazy.getInstance();
        System.out.println("End. mem. Lazy: "+ lazy);
        //Pode conferir, mesma instância.
        System.out.println("\n==========================================");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println("End. mem. Eager: "+ eager);
        eager = SingletonEager.getInstance();
        System.out.println("End. mem. Eager: "+ eager);
        System.out.println("\n==========================================");

        SingletonLazyHolder lHolder = SingletonLazyHolder.getInstance();
        System.out.println("End. mem. Holder: "+ lHolder);
        lHolder = SingletonLazyHolder.getInstance();
        System.out.println("End. mem. Holder: "+ lHolder);
        System.out.println("\n==========================================");
    }
}
