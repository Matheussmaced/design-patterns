package Singleton;

/*
 * Singleton "Preguiços"
 * 
*/
public class SingletonLazy {
  private static SingletonLazy instancia;

  private SingletonLazy() { // ninguem fora dessa classe irá instanciar ela mesma
    super();
  }

  public static SingletonLazy getInstancia() { // expoe a instancia dela mesma para publico
    if (instancia == null) {
      instancia = new SingletonLazy();
    }

    return instancia;
  }
}
