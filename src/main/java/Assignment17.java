/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter 1 for male and 2 for female: ");
        int sex = input1.nextInt();

        System.out.println("Enter how many oz of alcohol you have consumed: ");
        int a = input1.nextInt();

        System.out.println("Enter your wright in lbs: ");
        int w = input1.nextInt();

        System.out.println("Enter how many hours since your last drink: ");
        int h = input1.nextInt();

        if (sex == 1 ) {
            double BAC = ( ((a * 5.14) / (w * 0.73)) - (0.015*h));
            System.out.println("Your blood alcohol is: " + BAC);
            if (BAC > 0.08){
                System.out.printf("You may not drive");
            }
            else
            {
                System.out.printf("You may drive");
            }

        } else {
            double BAC = ( ((a * 5.14) / (w * 0.66)) - (0.015*h));
            System.out.println("Your blood alcohol is: " + BAC);
            if (BAC > 0.08){
                System.out.printf("You may not drive");
            }
            else
            {
                System.out.printf("You may drive");
            }
        }
    }








}
