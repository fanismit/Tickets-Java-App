import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int choice;


        while(true){
            System.out.println("######### Ticket-Seats Manager #########");
            System.out.println("Please, select your option:\n1) Customer\n2) Admin\n3) Content Admin\n4) Film\n5) Cinema\n6) Provoles ");
            Scanner choiceInput = new Scanner(System.in);
            choice = choiceInput.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Customer Option Selected!");
                    // login
                    // Menu for Customer (show available films, make reservation, update Info, ...)

                    break;
                case 2:
                    System.out.println("Admin Option Selected!");
                    break;
                case 3:
                    System.out.println("Content Admin Option Selected!");
                    break;
                case 4:
                    System.out.println("Film Option Selected!");
                    break;
                case 5:
                    System.out.println("Cinema Option Selected!");
                    break;
                case 6:
                    System.out.println("Provoles Option Selected!");
                    break;
                default:
                    return;
            }
        }
    }
}