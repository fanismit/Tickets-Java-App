package mainpackage.users;

import mainpackage.cinemas.Cinemas;
import mainpackage.films.Films;
import mainpackage.provoles.Provoles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class ContentAdmins extends Users {
    // Attributes
    private static int nextId = 0;
    private final int adminId;
    private ArrayList<Films> films = new ArrayList();
    private ArrayList<Cinemas> cinemas = new ArrayList();
    private ArrayList<Provoles> provoles = new ArrayList();
    private static Scanner input = new Scanner(System.in);
    // Constructor
    public ContentAdmins() {
        super();
        this.adminId = nextId++;
    }
    // Getters and Setters
    public int getAdminId() {
        return adminId;
    }

    public ArrayList<Films> getFilms() {
        return films;
    }
    // Methods
    public void insertFilm() {

        System.out.println("Please Enter Film Name:");
        String filmTitle = input.nextLine();

        System.out.println("Please Enter The Category of The Film:");
        String filmCategory = input.nextLine();

        System.out.println("Please Enter Film's Description:");
        String filmDescription = input.nextLine();

        // Create a new film object
        Films newFilm = new Films(filmTitle,filmCategory,filmDescription);
        films.add(newFilm);

        System.out.println("A new film with name " + filmTitle +" and Id "+newFilm.getFilmId() + " was inserted!");
    
     // Save film data to txt file
        try (FileWriter fileWriter = new FileWriter("Films.txt", true);
        	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        	bufferedWriter.write("Film Title: " + filmTitle + "\n");
        	bufferedWriter.write("Film Category: " + filmCategory + "\n");
        	bufferedWriter.write("Film Description: " + filmDescription + "\n");
        	bufferedWriter.write("Film ID: " + newFilm.getFilmId() + "\n");
        	bufferedWriter.write("\n"); // Add a newline separator between objects
        	
        	bufferedWriter.close();
            fileWriter.close();
            
            System.out.println("Film data saved to Films.txt file.");
        	} catch (IOException e) {
            System.out.println("Failed to save film data to file: " + e.getMessage());
        }
    }

    public void deleteFilm(int filmId) {
        Films filmToDelete = null;

        // Search for the film to be deleted inside the films array
        for(Films film: films){
            if (film.getFilmId() == filmId){
                filmToDelete = film;
                break;
            }
        }

        // Check if film can be deleted
        if(filmToDelete!=null){
            films.remove(filmToDelete);
            System.out.println("Film with Id "+filmId+" was deleted successfully!");
        }else{
            System.out.println("Film not found!");
        }
    }

    public void insertCinema(){

        boolean cinemaIs3D;
        int cinemaNumberOfSeats = 0;

        System.out.println("Enter Cinema's Location: ");
        String cinemaLocation = input.nextLine();

        // Check User input is 'Yes' or 'No'
        System.out.println("Is The Cinema 3D? ");
        String strCinemaIs3D = input.nextLine();
        while(!(strCinemaIs3D.equals("Yes")||strCinemaIs3D.equals("No"))){
            System.out.println("Please Enter 'Yes' or 'No'!");
            strCinemaIs3D = input.nextLine();
        }

        cinemaIs3D = strCinemaIs3D.equals("Yes");

        // Check if capacity is a positive number
        while(cinemaNumberOfSeats<=0) {
            System.out.println("Please enter the capacity of the cinema");
            while(!input.hasNextInt()){
                System.out.println("Invalid input. Please enter a number!");
                input.next();
            }
            cinemaNumberOfSeats = input.nextInt();
            if(cinemaNumberOfSeats<=0){
                System.out.println("Invalid input. Number must be positive!");
            }
            input.nextLine();
        }

        Cinemas newCinema = new Cinemas(cinemaIs3D,cinemaNumberOfSeats,cinemaLocation);
        cinemas.add(newCinema);
        
        System.out.println("A new Cinema with Id " + newCinema.getCinemaId() +" located in "+ newCinema.getCinemaLocation() + " was inserted!");
        
     // Save film data to txt file
        try (FileWriter fileWriter = new FileWriter("Cinemas.txt", true);
        	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        	bufferedWriter.write("Cinema ID: " + newCinema.getCinemaId() + "\n");
            bufferedWriter.write("Cinema Location: " + cinemaLocation + "\n");
            bufferedWriter.write("Is Cinema 3D: " + (cinemaIs3D ? "Yes" : "No") + "\n");
            bufferedWriter.write("Cinema Number of Seats: " + cinemaNumberOfSeats + "\n");
        	bufferedWriter.write("\n"); // Add a newline separator between objects
        	
        	bufferedWriter.close();
            fileWriter.close();
            
            System.out.println("Cinema data saved to Cinemas.txt file.");
        	} catch (IOException e) {
            System.out.println("Failed to save film data to file: " + e.getMessage());
        }
    }

    public void assignFilmToCinema() {

        //Ask for cinema input
        System.out.println("Enter an existing cinema Id: ");
        int cinemaId = input.nextInt();

        // Find cinema in array cinemas
        Cinemas selectedCinema = null;
        for (Cinemas cinema: cinemas){
            if(cinema.getCinemaId() == cinemaId){
                selectedCinema = cinema;
                break;
            }
        }

        // Cinema does not exist
        if (selectedCinema ==null){
            System.out.println("Cinema does not exist!");
            return;
        }

        // Ask for film input
        System.out.println("Enter film Id: ");
        int filmId = input.nextInt();

        // Find film in films array
        Films selectedFilm = null;
        for (Films film: films){
            if(film.getFilmId() == filmId){
                selectedFilm = film;
                break;
            }
        }

        // Film does not exist
        if (selectedFilm == null){
            System.out.println("Film does not exist!");
            return;
        }

        System.out.println("Enter the start date of the film ");
        
        
        LocalDate provoliStartDate= dateInput("Enter a date (like 3/3/17): ");
        
        System.out.println("Enter the end date of the film "); // Μία εξάιρεση αν δωθεί end πριν το start
        
        LocalDate provoliEndDate= dateInput("Enter a date (like 3/3/17): ");
        
        Provoles provoli = new Provoles(selectedFilm,selectedCinema,provoliStartDate,provoliEndDate,0,true);
        // Assign film to cinema
        provoles.add(provoli);
        selectedCinema.addFilm(selectedFilm);
        
        try (FileWriter fileWriter = new FileWriter("Provoles.txt", true);
            	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            	bufferedWriter.write("Provoli ID: " + provoli.getProvoliID() + "\n");
                bufferedWriter.write("Cinema Location: " + selectedCinema.getCinemaId() + "\n");
                bufferedWriter.write("Start date " + provoli.getProvoliStartDate()+ "\n");
                bufferedWriter.write("End date: " + provoli.getProvoliEndDate() + "\n");
                bufferedWriter.write("Number of reservations : 0 \n");
                bufferedWriter.write("Available : true \n");
            	bufferedWriter.write("\n"); // Add a newline separator between objects
            	
            	bufferedWriter.close();
                fileWriter.close();
                
                System.out.println("Cinema data saved to Provoles.txt file, and "+"The film " + selectedFilm.getFilmTitle() + " was assigned to cinema " + selectedCinema.getCinemaId());
            	} catch (IOException e) {
                System.out.println("Failed to save provoli data to file: " + e.getMessage());
            }
        
    }
    public static LocalDate dateInput(String userInput) {


        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(userInput, dateFormat);


        System.out.println(date);
        return date ;
    }
  
}
