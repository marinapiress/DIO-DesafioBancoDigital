public class MaquinaCaixa {
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente marina = new Cliente("Marina");
        Conta cc = new ContaCorrente(marina);
        Conta cp = new ContaPoupanca(marina);

        b.setContas(cc);
        b.setContas(cp);

        cc.depositar(100.0);
        cc.tranferir(100.0, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("-----------------------------");
        System.out.println("Quantidade de Contas do Banco");
        System.out.println("-----------------------------");
        System.out.println(b.getContas().size());

        System.out.println("------------------------------");
        System.out.println("Quantidade de Contas Correntes");
        System.out.println("------------------------------");
        System.out.println(b.getContaCorrente().size());

        System.out.println("-----------------------------");
        System.out.println("Quantidade de Contas Poupança");
        System.out.println("-----------------------------");
        System.out.println(b.getContaPoupanca().size());

        System.out.println("-------------------------------");
        System.out.println("Quantidade de Clientes do Banco");
        System.out.println("-------------------------------");
        b.listarClientes();
    }
}
