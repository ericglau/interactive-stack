package com.sample;

public class App {
        public static void main(String[] args) throws Exception {
                if (System.console() == null) {
                        System.out.println("Non interactive mode");
                } else {
                        System.out.println("Waiting for input...");                        
                        if (System.console().readLine() != null) {
                                System.out.println("Line detected");
                        } else {
                                System.out.println("Non interactive mode");
                        }
                }
        }

}
