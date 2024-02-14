package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            countdown(getInt("Count number:"), getInt("Time interval:"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static void countdown (int count, int seconds) throws InterruptedException {
        while(count >= 0){
            System.out.println(count);
            Thread.sleep(seconds* 1000L);
            count --;
        }
    }

    public static int getInt(String message) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.nextInt();
                if(input>0){
                    acceptedInput = true;
                } else {
                    System.out.println("Negative numbers aren't accepted.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
}