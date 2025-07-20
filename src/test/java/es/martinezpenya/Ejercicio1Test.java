package es.martinezpenya;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ejercicio1Test {

    @Test
    void testMainImprimeHolaMundo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            Ejercicio1.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        assertEquals("Hola Mundo!\n", outContent.toString());
    }
}