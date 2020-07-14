package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose NBA players to start/bench/cut");

        System.out.println("Choose the players to start: \n" +
                "1 - Trae Young \n" +
                "2 - Jason Tatum \n" +
                "3 - Luka Doncic");

        System.out.println("Choose player to start: ");
        int firstChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose player to bench: ");
        int secondChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose player to cut: ");
        int thirdChioice = scanner.nextInt();
        scanner.nextLine();

        getChoices(firstChoice,secondChoice,thirdChioice);

    }

    public static void getChoices(int firstChoice, int secondChoice, int thirdChoice) {
        int firstDigit = firstChoice * 100;
        int secondDigit = secondChoice * 10;
        int thirdDigit = thirdChoice;

        int total = firstDigit + secondDigit + thirdDigit;

        firstDigit = total / 100; //Get the first digit to determine first choice
        total %= 100;

        secondDigit = total / 10; //Getting second digit to determine second choice
        total %= 10;

        thirdDigit = total;  //Getting third digit to determine last choice


        switch (firstDigit) {
            case 1:
                System.out.println("Start Trae Young");
                break;
            case 2:
                System.out.println("Start Jason Tatum");
                break;
            case 3:
                System.out.println("Start Luka Doncic");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        switch (secondDigit) {

            case 1:
                System.out.println("Bench Trae Young");
                break;
            case 2:
                System.out.println("Bench Jason Tatum");
                break;
            case 3:
                System.out.println("Bench Luka Doncic");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        switch (thirdDigit) {

            case 1:
                System.out.println("Cut Trae Young");
                break;
            case 2:
                System.out.println("Cut Jason Tatum");
                break;
            case 3:
                System.out.println("Cut Luka Doncic");
                break;

            default:
                System.out.println("Invalid input!");
                break;

        }
    }
}