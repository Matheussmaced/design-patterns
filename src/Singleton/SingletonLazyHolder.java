package Singleton;
/*
 * Singleton "Lazy holder"
 * 
 */

public class SingletonLazyHolder {
  // vai encapsular essa instancia em uma classe estatica interna
  private static class InstanceHolder {
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() { // ninguem fora dessa classe irá instanciar ela mesma
    super();
  }

  // ela já estará pronta para ser retornada
  public static SingletonLazyHolder getInstacia() {
    return InstanceHolder.instancia;
  }
}
