package mainpackage;

public class Customers {
    // Attributes
    private String customerName;
    private String email;
    private int customerId;
    private int reservationId;

    // Constructor
    public Customers(String customerName, String email, int customerId, int reservationId) {
        this.customerName = customerName;
        this.email = email;
        this.customerId = customerId;
        this.reservationId = reservationId;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
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

