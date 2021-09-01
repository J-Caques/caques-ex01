/*
   UCF COP3330 Fall 2021 Assignment 1 Solution
   Copyright 2021 Jonathan Caques
 */
package exercise01;

import java.util.Scanner;

public class Solution01 {
    /*
    Print "What is your name?"
    Read input from user using scanner
    initialize variable name:
         String name = input.nextLine()
    Print "Hello <name>, nice to meet you!"
     */
    public static void main(String[] args) {
        System.out.println("What is your name?: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name + ", nice to meet you!");
    }
}
