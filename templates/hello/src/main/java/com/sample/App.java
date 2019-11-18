package com.sample;

import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                try {
                        System.out.println("Waiting for input...");
                        if (scanner.hasNextLine()) {
                                System.out.println("Line detected");
                        } else {
                                System.out.println("Non interactive mode");
                        }
                } finally {
                        scanner.close();
                }
        }

}
