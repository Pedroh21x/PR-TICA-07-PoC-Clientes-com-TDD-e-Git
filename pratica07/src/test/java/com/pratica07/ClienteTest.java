package com.pratica07;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void deveCriarCliente() {
        Cliente cliente = new Cliente(1, "Daniel", 10);

        assertNotNull(cliente);
    }
    @Test
public void deveRetornarId() {
    Cliente cliente = new Cliente(1, "Daniel", 10);

    assertEquals(1, cliente.getId());
}
    @Test
public void deveRetornarNome() {
    Cliente cliente = new Cliente(1, "Daniel", 10);

    assertEquals("Daniel", cliente.getNome());
}
}
