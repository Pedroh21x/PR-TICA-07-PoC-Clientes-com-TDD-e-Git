import com.pratica07.Cliente;
import com.pratica07.ContaCliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaClienteTest {

    @Test
    void deveCriarContaComIdClienteESaldo() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        ContaCliente conta = new ContaCliente(100, cliente, 500.0);

        assertEquals(100, conta.getId());
        assertEquals(cliente, conta.getCliente());
        assertEquals(500.0, conta.getSaldo());
    }

    @Test
    void deveCriarContaComSaldoZero() {
        ContaCliente conta = new ContaCliente(100);

        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    void deveCriarContaComCliente() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        ContaCliente conta = new ContaCliente(100, cliente);

        assertEquals(cliente, conta.getCliente());
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    void devePermitirAlterarCliente() {
        Cliente cliente1 = new Cliente(1, "Joao", 10);
        Cliente cliente2 = new Cliente(2, "Maria", 20);

        ContaCliente conta = new ContaCliente(100, cliente1);

        conta.setCliente(cliente2);

        assertEquals(cliente2, conta.getCliente());
    }

    @Test
    void devePermitirAlterarSaldo() {
        ContaCliente conta = new ContaCliente(100);

        conta.setSaldo(500.0);

        assertEquals(500.0, conta.getSaldo());
    }

    @Test
    void deveAdicionarDepositoAoSaldo() {
        ContaCliente conta = new ContaCliente(100);

        double novoSaldo = conta.addDeposito(100.0);

        assertEquals(100.0, novoSaldo);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void deveSubtrairValorDoSaldo() {
        ContaCliente conta = new ContaCliente(100, null, 200.0);

        double novoSaldo = conta.subSaldo(50.0);

        assertEquals(150.0, novoSaldo);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirRetiradaMaiorQueOSaldo() {
        ContaCliente conta = new ContaCliente(100, null, 100.0);

        double novoSaldo = conta.subSaldo(150.0);

        assertEquals(300.0, novoSaldo);
    }
}
