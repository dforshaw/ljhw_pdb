package com.programmingbydoing.section3keyboardinput;

import java.util.Scanner;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 15
 */

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word!");
        keyboard.next();

        System.out.println("Give me a second word!");
        keyboard.next();

        System.out.println("\nGreat, now your favorite number?");
        keyboard.nextInt();

        System.out.println("And your second-favorite number...");
        keyboard.nextInt();

        System.out.println("\nWhew! Wasn't that fun?");
    }
}
