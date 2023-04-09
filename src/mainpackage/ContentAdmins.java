package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;
public class ContentAdmins extends Users {
    // Attributes
    private int adminId;
    private ArrayList<Films> films = new ArrayList();

    // Constructor
    public ContentAdmins(int adminId) {
        super();
        this.adminId = adminId;
    }
    // Getters and Setters
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public ArrayList<Films> getFilms() {
        return films;
    }
    // Methods
    public void insertFilm() {

        Scanner input  = new Scanner(System.in);

        System.out.println("Please Enter Film's Id:");
        int filmId = input.nextInt();

        System.out.println("Please Enter Film Name:");
        String filmTitle = input.nextLine();

        System.out.println("Please Enter The Category of The Film:");
        String filmCategory = input.nextLine();

        System.out.println("Please Enter Film's Description:");
        String filmDescription = input.nextLine();

        System.out.println("Please Enter The Film's Required Age:");
        int requiredAge = input.nextInt();

        input.close();
        // Create a new film object
        Films newFilm = new Films(filmId, filmTitle,filmCategory,filmDescription);
        films.add(newFilm);

        System.out.println("A new film with name " + filmTitle +" and Id "+filmId + " was inserted!");
    }

    public void deleteFilm(int filmId) {
        // Films filmToDelete =
    }

    public void assignFilmToCinema() {
        System.out.println("Assigning a film to a cinema.");
    }
}
