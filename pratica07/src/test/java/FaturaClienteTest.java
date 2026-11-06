import com.pratica07.Cliente;
import com.pratica07.fatura_cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaClienteTest {

    @Test
    void deveCriarFaturaComIdClienteEValor() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente);

        assertEquals(100, fatura.getId());
        assertEquals(cliente, fatura.getCliente());
        assertEquals(100.0, fatura.getValor());
    }

    @Test
    void deveCriarFaturaSomenteComId() {
        fatura_cliente fatura = new fatura_cliente(100);

        assertEquals(100, fatura.getId());
    }

    @Test
    void devePermitirAlterarCliente() {
        Cliente cliente1 = new Cliente(1, "Joao", 10);
        Cliente cliente2 = new Cliente(2, "Maria", 20);

        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente1);

        fatura.setCliente(cliente2);

        assertEquals(cliente2, fatura.getCliente());
    }

    @Test
    void devePermitirAlterarValor() {
        Cliente cliente = new Cliente(1, "Joao", 10);
        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente);

        fatura.setValor(200.0);

        assertEquals(200.0, fatura.getValor());
    }

    @Test
    void deveCalcularValorComDesconto() {
        Cliente cliente = new Cliente(1, "Joao", 10);
        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente);

        assertEquals(90.0, fatura.getValorComDesconto());
    }

    @Test
    void deveCalcularValorSemDesconto() {
        Cliente cliente = new Cliente(1, "Joao", 0);
        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente);

        assertEquals(100.0, fatura.getValorComDesconto());
    }
}
