import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void deveCriarCliente() {
        Cliente cliente = new Cliente(1, "Daniel", 10);

        assertNotNull(cliente);
    }
}