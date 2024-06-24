import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Teste {
  public static void main(String[] args) {

    // Singleton
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstacia();
    System.out.println(holder);

    // Strategy

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setStrategy(normal);

    robo.mover();
    robo.mover();

    robo.setStrategy(agressivo);

    robo.mover();
    robo.mover();

    robo.setStrategy(defensivo);

    robo.mover();
    robo.mover();
    robo.mover();

    // Facade

    Facade facade = new Facade();
    facade.migrarCliente("Matheus", "63360000");
  }
}
