import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.ChecarFibonacci;
import com.example.InverterString;

public class Tests {

    // Estes são os testes para as atividades que possuem entrada de dados, os fixos são executados na main, visto que o resultado não se altera.

    @Test
    public void pertenceFibonacci() {
        assertTrue(ChecarFibonacci.pertenceFibonacci(8));
        assertTrue(ChecarFibonacci.pertenceFibonacci(0));
        assertFalse(ChecarFibonacci.pertenceFibonacci(4));
    }

    @Test
    public void inverterString() {
        assertEquals("cba", InverterString.inverter("abc"));
        assertEquals("987654321", InverterString.inverter("123456789"));
    }
}
