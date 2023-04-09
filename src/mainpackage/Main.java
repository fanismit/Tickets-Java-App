package mainpackage;

import java.util.Scanner;
import mainpackage.users.ContentAdmins;
import mainpackage.users.Customers;
import mainpackage.users.Admins;
import mainpackage.users.Users;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int choice;
        boolean isRunning= false;
        String role;
        
        while(!isRunning){
            System.out.println("######### Ticket-Seats Manager #########");
            System.out.println("Please, select your option:\n1)Customer\n2)Admin\n3)ContentAdmin");
            Scanner choiceInput = new Scanner(System.in);
            choice = choiceInput.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Customer Option Selected!");
                    role="Customer";
                    
                    // Menu for Customer (show available films, make reservation, update Info, ...)
                    isRunning=true;
                    break;
                case 2:
                    System.out.println("Admin Option Selected!");
                    isRunning=true;
                    role="Admin";
                    Admins admin = new Admins();
                    saveToFile(admin, "Admins.txt");
                    break;
                case 3:
                    System.out.println("Content Admin Option Selected!");
                    isRunning=true;
                    role="ContentAdmin";
                    ContentAdmins contentadmin = new ContentAdmins();
                    contentadmin.insertCinema();
                    contentadmin.insertFilm();
                    contentadmin.assignFilmToCinema();
                    
                    break;
                default:
                    return;
            }
        }
    }
    public static void saveToFile(Users users, String filename) {
    	 try {
             FileWriter fileWriter = new FileWriter(filename, true); // Append mode
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

             // Write the object data to the file
             bufferedWriter.write("Name: " + users.getName() + "\n");
             bufferedWriter.write("Username: " + users.getUsername() + "\n");
             bufferedWriter.write("Password: " + users.getPassword() + "\n");
             bufferedWriter.write("Email: " + users.getEmail() + "\n");
             bufferedWriter.write("\n"); // Add a newline separator between objects

             bufferedWriter.close();
             fileWriter.close();
             System.out.println("Object saved to " + filename + " successfully!");
         } catch (IOException e) {
             System.out.println("Error occurred while saving object to " + filename);
             e.printStackTrace();
         }
    }
}