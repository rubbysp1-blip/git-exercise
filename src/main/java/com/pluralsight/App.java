package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the HEB app!");
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.println("Hello! " + name);

        //You can explain, in one sentence, why the greeting disappeared in Step 5
        //It disappeared because the changes were being made in the branch instead
        //of being made in the main branch. Also, both branches were still not
        //merge to each other.
    }
}
