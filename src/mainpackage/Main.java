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
        int role, action;
        Scanner roleInput = new Scanner(System.in);
        Scanner actionInput = new Scanner(System.in);
        ContentAdmins c1 = new ContentAdmins();
        c1.insertCinema();
        c1.insertFilm();
        c1.assignFilmToCinema();
        //c1.deleteFilm();
        boolean MenuIsRunning= false;

        while(!MenuIsRunning){
            System.out.println("######### Ticket-Seats Manager #########");
            System.out.println("Please, select your role:\n1)Customer\n2)Admin\n3)ContentAdmin");
            role = roleInput.nextInt();

            switch (role){
                case 1:
                    Customers customer = new Customers();
                    //customer.login();
                    // if login successfully continue
                    //else go back to menu
                    System.out.println("######### Customer Options Menu #########");
                    System.out.println("Please, select your action:\n1) Show Available Films\2) Make Reservation\n3) View Reservation");
                    action = actionInput.nextInt();

                    switch (action){
                        case 1:
                            System.out.println("Showing Available Films ...");
                            //customer.showAvailableFilms();
                            break;
                        case 2:
                            System.out.println("Making a reservation ...");
                            //customer.makeReservation();
                            break;
                        case 3:
                            System.out.println("View reservation ...");
                            //customer.viewReservation();
                            break;
                        default:
                            return;
                    }
                    // Menu for Customer (show available films, make reservation, update Info, ...)
                    MenuIsRunning=true;
                    break;
                case 2:
                    Admins admin = new Admins();
                    //admin.login()
                    // if login successfully continue
                    //else go back to menu
                    System.out.println("######### Admins Option Menu #########");
                    System.out.println("Please, select your option:\n1) Create user\n2) Update user\n3) Delete user\n4) Search User\n5) View all users\n6) Register Admin");
                    System.out.println("Admin Option Selected!");
                    action = actionInput.nextInt();
                    switch (action){
                        case 1:
                            System.out.println("Create user Option Selected!");
                            //admin.createUser();
                            break;
                        case 2:
                            System.out.println("Update user Option Selected!");
                            //admin.updateUser();
                            break;
                        case 3:
                            System.out.println("Delete user Option Selected!");
                            //admin.deleteUser();
                            break;
                        case 4:
                            System.out.println("Search user Option Selected!");
                            //admin.searchUser();
                            break;
                        case 5:
                            System.out.println("View all users user Option Selected!");
                            //admin.viewAllUsers();
                            break;
                        case 6:
                            System.out.println("Register Admin Option Selected!");
                            //admin.registerAdmin();
                            break;
                        default:
                            return;
                    }
                    MenuIsRunning=true;
                    saveToFile(admin, "Admins.txt");
                    break;
                case 3:
                    System.out.println("Content Admin Option Selected!");
                    MenuIsRunning=true;
                    ContentAdmins contentadmin = new ContentAdmins();
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