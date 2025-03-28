package main;

import java.util.stream.Collectors;

public class UppercaseFilterUsingStreams {
    public static String filterUppercaseUsingStream(String input) {
        return input.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "HeLLo WoRLd!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingStream(input));
    }
}
