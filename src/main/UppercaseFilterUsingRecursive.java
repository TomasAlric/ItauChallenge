package main;

public class UppercaseFilterUsingRecursive {
    public static String filterUppercaseUsingRecursion(String input) {
        if (input.isEmpty()) {
            return "";
        }
        char firstChar = input.charAt(0);
        String rest = filterUppercaseUsingRecursion(input.substring(1));
        return Character.isUpperCase(firstChar) ? firstChar + rest : rest;
    }

    public static void main(String[] args) {
        String input = "HeLLo WoRLd!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingRecursion(input));
    }
}
