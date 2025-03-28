package main;

public class UppercaseFilterUsingStringAPI {
    public static String filterUppercaseUsingStringAPI(String input) {
        StringBuilder result = new StringBuilder();
        input.codePoints()
                .filter(Character::isUpperCase)
                .forEach(result::appendCodePoint);
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "HeLLo WoRLd!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingStringAPI(input));
    }
}
