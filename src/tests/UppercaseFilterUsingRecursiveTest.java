package tests;

import main.UppercaseFilterUsingRecursive;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseFilterUsingRecursiveTest {

    @Test
    public void testFilterUppercaseUsingRecursion() {
        // Teste com uma string contendo letras maiúsculas e minúsculas
        String input = "HeLLo WoRLd!";
        String expectedOutput = "HLLWRL";
        assertEquals(expectedOutput, UppercaseFilterUsingRecursive.filterUppercaseUsingRecursion(input));

        // Teste com uma string sem letras maiúsculas
        input = "hello world!";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingRecursive.filterUppercaseUsingRecursion(input));

        // Teste com uma string contendo apenas letras maiúsculas
        input = "HELLO WORLD!";
        expectedOutput = "HELLOWORLD";
        assertEquals(expectedOutput, UppercaseFilterUsingRecursive.filterUppercaseUsingRecursion(input));

        // Teste com uma string vazia
        input = "";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingRecursive.filterUppercaseUsingRecursion(input));

        // Teste com uma string contendo caracteres especiais e números
        input = "1234!@#$";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingRecursive.filterUppercaseUsingRecursion(input));
    }
}