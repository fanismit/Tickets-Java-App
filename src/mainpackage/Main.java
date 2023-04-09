package mainpackage;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int choice;
        boolean isRunning= false;

        while(!isRunning){
            System.out.println("######### Ticket-Seats Manager #########");
            System.out.println("Please, select your option:\n1) Customer\n2) Admin\n3) Content Admin");
            Scanner choiceInput = new Scanner(System.in);
            choice = choiceInput.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Customer Option Selected!");
                    // login
                    // Menu for Customer (show available films, make reservation, update Info, ...)
                    isRunning=true;
                    break;
                case 2:
                    System.out.println("Admin Option Selected!");
                    isRunning=true;
                    break;
                case 3:
                    System.out.println("Content Admin Option Selected!");
                    isRunning=true;
                    break;
                default:
                    return;
            }
        }
    }
}