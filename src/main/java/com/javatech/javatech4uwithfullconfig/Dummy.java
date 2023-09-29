package com.javatech.javatech4uwithfullconfig;

public class Dummy {
    public static void main(String[] args) {
        String text = "This is a sample text";

        // Step 1: Check if the string contains spaces
        boolean containsSpaces = text.contains(" ");

        if (containsSpaces) {
            System.out.println("The string contains spaces.");

            // Step 2: Remove spaces
            String textWithoutSpaces = text.replaceAll(" ", "");

            System.out.println("Text without spaces: " + textWithoutSpaces);
        } else {
            System.out.println("The string does not contain spaces.");
        }
    }
}
