package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the HEB app!");
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.println("Hello! " + name);
    }
}
