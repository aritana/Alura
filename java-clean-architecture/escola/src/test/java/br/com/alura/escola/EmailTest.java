package br.com.alura.escola;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class EmailTest {

    @Test
    public void shouldNotCreateEmailWithInvalidScenary() {
        assertThrows(IllegalArgumentException.class,()->new Email(null));
        assertThrows(IllegalArgumentException.class,()->new Email(""));
        assertThrows(IllegalArgumentException.class,()->new Email("emailinvalido"));
    }
}