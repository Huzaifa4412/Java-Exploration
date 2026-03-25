package com.example;

import org.fusesource.jansi.Ansi;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Ansi.ansi().a("Hello world"));
    }
}
