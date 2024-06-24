package Subsistema1;

public class CrmService {
  // construtor privado, garantindo que quem for consumir a classe, sempre vai
  // necessariamente consumir os metodos estaticos (não irá ficar instanciando
  // essa classe sem necessidade)
  private CrmService() {
    super();
  }

  public static void gravarCliente(String nome, String cep, String estado, String cidade) {
    System.out.println("Cliente salvo no sistema de CRM");
    System.out.println(nome);
    System.out.println(cep);
    System.out.println(cidade);
    System.out.println(estado);
  }
}
