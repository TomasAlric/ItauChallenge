package tests;

import main.UppercaseFilterUsingStreams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseFilterUsingStreamsTest {

    @Test
    public void testFilterUppercaseUsingStream() {
        // Teste com uma string contendo letras maiúsculas e minúsculas
        String input = "HeLLo WoRLd!";
        String expectedOutput = "HLLWRL";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        // Teste com uma string sem letras maiúsculas
        input = "hello world!";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        // Teste com uma string contendo apenas letras maiúsculas
        input = "HELLO WORLD!";
        expectedOutput = "HELLOWORLD";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        // Teste com uma string vazia
        input = "";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        // Teste com uma string contendo caracteres especiais e números
        input = "1234!@#$";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));
    }
}