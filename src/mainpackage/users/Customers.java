package mainpackage.users;

import java.util.ArrayList;
import mainpackage.cinemas.Cinemas;
import mainpackage.films.Films;

public class Customers extends Users {
    // Attributes
    private String reservationId;

    // Constructor
    public Customers(String reservationId) {
        super();
        this.reservationId = reservationId;
    }

    // Getters and Setters
    public String getReservationId() {
        return reservationId;
    }


    // Methods
    public void showAvailableFilms(ArrayList<Films> films) {
        System.out.println("Displaying list of available films:");
        for (Films film: films){
            System.out.println("Title: " +film.getFilmTitle()+ "Category: " + film.getFilmCategory() + "Description: "+film.getFilmDescription());
        }
    }

    public void makeReservation(String projection, int requestedSlots) {
        System.out.println(requestedSlots + " seats are booked for the film " + projection);
    }

    public void viewReservation() {
        System.out.println("Viewing reservation details.");
    }
}

