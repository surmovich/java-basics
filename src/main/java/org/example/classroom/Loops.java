package org.example.classroom;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        String[] fruits = {"apple", "mango", "banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + " ");
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("I found kiwi!");
        }
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }

        for (int i = 0; i <= 40; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                //System.out.println("Sum of even number: " + sum);
            }

        }
        System.out.println("Sum of even number: " + sum);

        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();

        }

        // while loop
        int i = 10;
        while (i > 0) {
            System.out.println("Hello World!");
            i--;
        }
        int j = 0;
        while (j < 10) {
            System.out.println("Hello World?");
            j++;
        }
        int m = 0;
        do {
            System.out.println("Hello!");
            m++;
        } while (m < 10);

        //Scanner myScanner = new Scanner(System.in);
        //Random randomizer = new Random();
        //int randomNumber = randomizer.nextInt(5);
        //System.out.println("Please enter number I guessed:");
        //boolean isGuessed = false;
        //while (!isGuessed) {
           // System.out.println("Please enter number I guessed:");
           //in(inputNumber = myScanner.nextInt();
             //if randomNumber == inputNumber) {
             // System.out.println("You guessed the number");
               //isGuessed = true;
            //} else {
               // System.out.println("Try again!");
          //  }

//TODO: Limit guest 3 times
            // Stream.of(fruits).forEach(System.out::println);
            String name = "Jelena";
            String reversed = "";
            for (int k = name.length() - 1; k >= 0; k--) {
                reversed = reversed + name.charAt(k);
            }
            System.out.println(reversed);

        }
    }



