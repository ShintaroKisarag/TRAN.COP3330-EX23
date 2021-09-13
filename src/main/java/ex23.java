/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char option;
        System.out.print("Is the car silent when you turn the key? ");
        option = input.next().charAt(0);    //stores user input
        if (option == 'y') {    //if user says yes
            System.out.print("Are the Battery terminals corroded? ");
            option = input.next().charAt(0);    //stores user input
            if (option == 'y')  //if user says yes
                System.out.print("Clean the terminals and try starting again.");
            else    //if user says no
                System.out.println("Replace cables and try again. ");
        } else {    //if user says no
            System.out.print("Does the car make slicking noise? ");
            option = input.next().charAt(0);    //stores user input
            if (option == 'y')  //if user says yes
                System.out.println("Replace the battery.");
            else {  //if user says no
                System.out.print("Does the car crank up but fail to start? ");
                option = input.next().charAt(0);    //stores user input
                if (option == 'y')  //if user says yes
                    System.out.println("Check spark plug connection");
                else {  //if user says no
                    System.out.print("Does the engine start and then die? ");
                    option = input.next().charAt(0);    //stores user input
                    if (option == 'y') {    //if user says yes
                        System.out.println("Does your car have fuel injection? ");
                        option = input.next().charAt(0);
                        if (option == 'y')  //if user says yes
                            System.out.println("Get in it for service.");
                        else    //if user says no
                            System.out.println("Check to ensure the choke is opening and closing");
                    }else{  //if user says no all the options
                        System.out.println("This should not be possible");
                    }
                }
            }
        }
    }
}
