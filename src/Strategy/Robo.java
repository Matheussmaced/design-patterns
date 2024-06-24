package Strategy;

public class Robo {
  private Comportamento strategy; // comportamentos de mover

  public void setStrategy(Comportamento strategy) {
    this.strategy = strategy;
  }

  public void mover() {
    strategy.mover();
  }

}
