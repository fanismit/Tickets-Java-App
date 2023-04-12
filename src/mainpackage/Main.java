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
        //Scanner roleInput = new Scanner(System.in);
        //Scanner actionInput = new Scanner(System.in);

        boolean MenuIsRunning= false;

        System.out.println("######### Ticket-Seats Manager #########");
        while(!MenuIsRunning){
            // Ask for input and validate it
            role = checkIntegerInputs("Please, select your role:\n1)Customer\n2)Admin\n3)ContentAdmin");

            switch (role){
                case 1:
                    Customers customer = new Customers();
                    saveToFile(customer, "Customers.txt");
                    //customer.makeReservation();
                    //customer.login();
                    // if login successfully continue
                    //else go back to menu
                    System.out.println("Customer Option Selected!");
                    System.out.println("######### Customer Options Menu #########");
                    action = checkIntegerInputs("Please, select your action:\n1) Show Available Films\n2) Make Reservation\n3) View Reservation");

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
                    System.out.println("Admin Option Selected!");
                    System.out.println("######### Admins Option Menu #########");
                    action = checkIntegerInputs("Please, select your option:\n1) Create user\n2) Update user\n3) Delete user\n4) Search User\n5) View all users\n6) Register Admin");
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
                    ContentAdmins contentadmins = new ContentAdmins();
                    //contentadmins.login()
                    // if login successfully continue
                    //else go back to menu
                    System.out.println("Content Admin Option Selected!");
                    System.out.println("######### ContentAdmins Option Menu #########");
                    action = checkIntegerInputs("Please, select your option:\n1) Insert film\n2) Delete Film\n3) Insert cinema\n4) Assign film to cinema");
                    switch (action){
                        case 1:
                            System.out.println("Insert Film Option Selected!");
                            //contentadmins.insertFilm();
                            break;
                        case 2:
                            System.out.println("Delete Film Option Selected!");
                            //contentadmins.updateUser();
                            break;
                        case 3:
                            System.out.println("Insert cinema Option Selected!");
                            contentadmins.insertCinema();
                            break;
                        case 4:
                            System.out.println("Assign film to cinema Option Selected!");
                            //contentadmins.assignFilmToCinema();
                            break;
                        default:
                            return;
                    }
                    MenuIsRunning=true;
                    //saveToFile(contentadmins, "contentAdmins.txt");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid selection.");
            }
        }
    }

    public static int checkIntegerInputs(String message){
        int role;
        Scanner roleInput = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            try {
                role = roleInput.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                roleInput.next(); // consume the invalid input
            }
        }

        return role;
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