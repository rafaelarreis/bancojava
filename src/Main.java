//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cliente = venilton = new Cliente();
        venilton.setnome("Venilton")

        ContaCorrente cc = new ContaCorrente(venilton);
        ContaPoupanca poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir((50, poupanca));

        System.out.printf(ImprimirExtrato);

    }
}