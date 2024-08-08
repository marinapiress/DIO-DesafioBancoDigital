import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public List<Conta>getContas() {
        return contas;
    }
    public List<Conta> getContaCorrente() {
        List<Conta> c = new ArrayList<>();
        if (!contas.isEmpty()) {
            Iterator<Conta> iterator = contas.iterator();
            while (iterator.hasNext()) {
                Conta ct = iterator.next();
                if (ct.getTipo() == 0) {
                    c.add(ct);
                }
            }
        }
        return c;
    }
    public List<Conta> getContaPoupanca() {
        List<Conta> c = new ArrayList<>();
        if (!contas.isEmpty()) {
            Iterator<Conta> iterator = contas.iterator();
            while (iterator.hasNext()) {
                Conta ct = iterator.next();
                if (ct.getConta() == 1) {
                    c.add(ct);
                }
            }
        }
        return c;
    }
    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    public void listarClientes() {
        Iterator<Conta> iterator = contas.iterator();
        while (iterator.hasNext()) {
            Conta ct = iterator.next();
            System.out.println(String.format("Cliente: %s", ct.cliente.getNome()));
            System.out.println(String.format("Agência: %d", ct.getAgencia()));
            System.out.println(String.format("Conta: %d", ct.getConta()));
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}
