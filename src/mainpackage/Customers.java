package mainpackage;

public class Customers extends Users {
    // Attributes
    private String reservationId;
    private int age;

    // Constructor
    public Customers(String name, String username, String password, String email, String reservationId, int age) {
        super(name, username, password, email);
        this.reservationId = reservationId;
        this.age = age;
    }

    // Getters and Setters
    public String getReservationId() {
        return reservationId;
    }


 // Methods
    public void showAvailableFilms() {
        System.out.println("Displaying list of available films.");
        // Implementation to be added later
    }

    public void makeReservation(String projection, int requestedSlots) {
        System.out.println(requestedSlots + " seats are booked for the film " + projection);
    }

    public void viewReservation() {
        System.out.println("Viewing reservation details.");
    }
}

