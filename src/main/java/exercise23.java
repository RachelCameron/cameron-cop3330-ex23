/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response;
        System.out.println("Is the car silent when you turn the key? ");
        response = input.next();
        if (response.equals("y")){
            System.out.println("Are the battery terminals corroded? ");
            response = input.next();
            if (response.equals ("y")){
                System.out.println("Clean terminals and try starting again.");
            }else{
                System.out.println("Replace cables and try again.");
            }
        }else{
            System.out.println("Does the car make a clicking noise? ");
            response = input.next();
            if (response.equals("y")){
                System.out.println("Replace the battery.");
            }else{
                System.out.println("Does the car crank up but fail to start? ");
                response = input.next();
                if (response.equals("y")){
                    System.out.println("Check spark plug connections.");
                }else{
                    System.out.println("Does the engine start and then die?");
                    response = input.next();
                    if (response.equals("y")){
                        System.out.println("Does your car have fuel injections?");
                        response = input.next();
                        if (response.equals("y")){
                            System.out.println("Get it in for service.");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing. ");
                        }
                    }else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}