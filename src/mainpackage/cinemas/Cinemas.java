package mainpackage.cinemas;

import java.util.ArrayList;

import mainpackage.films.Films;

public class Cinemas {
    // Attributes
    private static int nextId = 0;
    private final int cinemaId;
    private boolean cinemaIs3D;
    private int cinemaNumberOfSeats;
    private String cinemaLocation;
    private ArrayList<Films> films;

    // Constructor
    public Cinemas(boolean cinemaIs3D, int cinemaNumberOfSeats, String cinemaLocation) {
        this.cinemaId = nextId++;
        this.cinemaIs3D = cinemaIs3D;
        this.cinemaNumberOfSeats = cinemaNumberOfSeats;
        this.cinemaLocation = cinemaLocation;
        this.films = new ArrayList<>();
    }

    // Getters and Setters
    public int getCinemaId() {
        return cinemaId;
    }

    public boolean isCinemaIs3D() {
        return cinemaIs3D;
    }

    public int getCinemaNumberOfSeats() {
        return cinemaNumberOfSeats;
    }

    public String getCinemaLocation(){return cinemaLocation;}

    public ArrayList<Films> getFilms() {
        return films;
    }

    // Methods
    public void addFilm(Films film){
        films.add(film);
    }
    public void viewCinemaDetails() {
        System.out.println("Viewing cinema details.");
    }

    public void updateCinemaDetails() {
        System.out.println("Updating cinema details.");
    }

    public void deleteCinema() {
        System.out.println("Deleting a cinema.");
    }

    public void viewAllCinemas() {
        System.out.println("Viewing all cinemas.");
    }
}
