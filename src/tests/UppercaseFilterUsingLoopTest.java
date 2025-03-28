package tests;

import main.UppercaseFilterUsingLoop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseFilterUsingLoopTest {

    @Test
    public void testFilterUppercaseUsingLoop() {
        // Teste com uma string contendo letras maiúsculas e minúsculas
        String input = "HeLLo WoRLd!";
        String expectedOutput = "HLLWRL";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        // Teste com uma string sem letras maiúsculas
        input = "hello world!";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        // Teste com uma string contendo apenas letras maiúsculas
        input = "HELLO WORLD!";
        expectedOutput = "HELLOWORLD";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        // Teste com uma string vazia
        input = "";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        // Teste com uma string contendo caracteres especiais e números
        input = "1234!@#$";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));
    }
}