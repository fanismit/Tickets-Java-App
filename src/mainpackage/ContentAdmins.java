package mainpackage;

public class ContentAdmins extends Users {
    // Attributes
    private String adminId;
    private String cinemaId;

    // Constructor
    public ContentAdmins(String name, String username, String password, String email, String adminId, String cinemaId) {
        super(name, username, password, email);
        this.adminId = adminId;
        this.cinemaId = cinemaId;
    }
    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }
    
 // Methods
    public void insertFilm() {
        System.out.println("Inserting a new film into the system.");
    }

    public void deleteFilm() {
        System.out.println("Deleting a film from the system.");
    }

    public void assignFilmToCinema() {
        System.out.println("Assigning a film to a cinema.");
    }
}
