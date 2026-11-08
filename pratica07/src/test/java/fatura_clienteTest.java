import com.pratica07.Cliente;
import com.pratica07.fatura_cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class fatura_clienteTest {


@Test
void testConstrutorCompleto() {
    Cliente cliente = new Cliente(1, "Ana",2);

    fatura_cliente fatura = new fatura_cliente(10, 200.0, cliente);

    assertEquals(10, fatura.getId());
    assertEquals(200.0, fatura.getValor());
    assertSame(cliente, fatura.getCliente());
}

@Test
void testConstrutorSomenteId() {
    fatura_cliente fatura = new fatura_cliente(20);

    assertEquals(20, fatura.getId());
    assertEquals(0.0, fatura.getValor());
    assertNull(fatura.getCliente());
}

@Test
void testGetId() {
    fatura_cliente fatura = new fatura_cliente(30);

    assertEquals(30, fatura.getId());
}

@Test
void testGetCliente() {
    Cliente cliente = new Cliente(1, "Maria",15);

    fatura_cliente fatura = new fatura_cliente(40, 150.0, cliente);

        assertEquals(90.0, fatura.getValorComDesconto());
    }
@Test
    void deveCalcularDescontoDeCinquentaPorCento() {
        Cliente cliente = new Cliente(1, "Joao", 50);
        fatura_cliente fatura = new fatura_cliente(100, 200.0, cliente);

        assertEquals(100.0, fatura.getValorComDesconto(), 0.001);
    }
@Test
    void deveCalcularValorZeradoComDescontoDeCemPorCento() {
        Cliente cliente = new Cliente(1, "Joao", 100);
        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente);

        assertEquals(0.0, fatura.getValorComDesconto(), 0.001);
    }
    @Test
    void deveRecalcularDescontoAoAlterarValor() {
        Cliente cliente = new Cliente(1, "Joao", 10);
        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente);

        fatura.setValor(200.0);

        assertEquals(180.0, fatura.getValorComDesconto(), 0.001);
    }
@Test
    void deveUsarDescontoDoNovoClienteAoTrocarCliente() {
        Cliente cliente1 = new Cliente(1, "Joao", 10);
        Cliente cliente2 = new Cliente(2, "Maria", 20);
        fatura_cliente fatura = new fatura_cliente(100, 100.0, cliente1);

        fatura.setCliente(cliente2);

        assertEquals(80.0, fatura.getValorComDesconto(), 0.001);
    }
}

