package com.pratica07;

public class ClienteTest {

    @Test
    void deveCriarClienteComIdNomeEDesconto() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        assertEquals(1, cliente.getId());
        assertEquals("Joao", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
    }

    @Test
    void deveRetornarGeneroDoCliente() {
        Cliente cliente = new Cliente(1, "Maria", 10);

        assertEquals("f", cliente.getGenero());
    }

    @Test
    void devePermitirAlterarDesconto() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        cliente.setDesconto(20);

        assertEquals(20, cliente.getDesconto());
    }

    @Test
    void deveRetornarClienteNoFormatoEsperado() {
        Cliente cliente = new Cliente(1, "Joao", 10);

        assertEquals("Joao(1)(10%)", cliente.toString());
    }
}

