import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaClienteTest {

    @Test
    void deveCriarFaturaComIdClienteEValor() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        FaturaCliente fatura = new FaturaCliente(100, cliente, 100.0);

        assertEquals(100, fatura.getId());
        assertEquals(cliente, fatura.getCliente());
        assertEquals(100.0, fatura.getValor());
    }

    @Test
    void deveCriarFaturaSomenteComId() {
        FaturaCliente fatura = new FaturaCliente(100);

        assertEquals(100, fatura.getId());
    }

    @Test
    void devePermitirAlterarCliente() {
        Cliente cliente1 = new Cliente(1, "Joao", 10);
        Cliente cliente2 = new Cliente(2, "Maria", 20);

        FaturaCliente fatura = new FaturaCliente(100, cliente1, 100.0);

        fatura.setCliente(cliente2);

        assertEquals(cliente2, fatura.getCliente());
    }

    @Test
    void devePermitirAlterarValor() {
        Cliente cliente = new Cliente(1, "Joao", 10);
        FaturaCliente fatura = new FaturaCliente(100, cliente, 100.0);

        fatura.setValor(200.0);

        assertEquals(200.0, fatura.getValor());
    }

    @Test
    void deveCalcularValorComDesconto() {
        Cliente cliente = new Cliente(1, "Joao", 10);
        FaturaCliente fatura = new FaturaCliente(100, cliente, 100.0);

        assertEquals(90.0, fatura.getValorComDesconto());
    }

    @Test
    void deveCalcularValorSemDesconto() {
        Cliente cliente = new Cliente(1, "Joao", 0);
        FaturaCliente fatura = new FaturaCliente(100, cliente, 100.0);

        assertEquals(100.0, fatura.getValorComDesconto());
    }
}