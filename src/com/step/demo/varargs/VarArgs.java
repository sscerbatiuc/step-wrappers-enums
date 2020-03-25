package com.step.demo.varargs;

/**
 *
 * @author sscerbatiuc
 */
public class VarArgs {

    public static void main(String[] args) {
        String salut = "Salut";
        String sunt = "Sunt";
        String eu = "Eu";
        String haiduc = "Un Haiduc";

        display(salut, sunt, eu, haiduc);
    }

    public static void display(String... args) {
        for (String message : args) {
            System.out.println(message);
        }
    }

}
