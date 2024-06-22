package Singleton;
/*
 * Singleton "apressado"
 * 
 */

public class SingletonEager {
  // no momento que essa classe for acionada por alguem, essa instancia já é
  // atribuida

  private static SingletonEager instancia = new SingletonEager();

  private SingletonEager() { // ninguem fora dessa classe irá instanciar ela mesma
    super();
  }

  // ela já estará pronta para ser retornada
  public static SingletonEager getInstancia() { // expoe a instancia dela mesma para publico
    if (instancia == null) {

    }

    return instancia;
  }
}
