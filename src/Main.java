public class Main {

  public static void main(String[] args) {
    Cliente murillo = new Cliente();
    murillo.setNome("Murillo");

    Conta cc = new ContaCorrente(murillo);
    Conta poupanca = new ContaPoupanca(murillo);

    cc.depositar(100);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }

}