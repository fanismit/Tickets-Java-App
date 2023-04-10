package mainpackage.users;

import java.util.ArrayList;
import mainpackage.cinemas.Cinemas;
import mainpackage.films.Films;

public class Customers extends Users {
    // Attributes
    private String reservationId;

    // Constructor
    public Customers() {
        super();
        // reservationId will be set when makeReservation method is called
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
        // Increase reservationId by one for every reservation
        int reservationIdInt = Integer.parseInt(reservationId == null ? "0" : reservationId);
        reservationIdInt++;
        reservationId = Integer.toString(reservationIdInt);

        System.out.println(requestedSlots + " seats are booked for the film " + projection + "with the code "+ reservationId);
    }

    public void viewReservation() {
        System.out.println("Viewing reservation details.");
    }
}
