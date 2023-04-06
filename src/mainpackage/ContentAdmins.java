package mainpackage;

public class ContentAdmins {
    // Attributes
    private String adminName;
    private String email;
    private int adminId;
    private int cinemaId;

    // Constructor
    public ContentAdmins(String adminName, String email, int adminId, int cinemaId) {
        this.adminName = adminName;
        this.email = email;
        this.adminId = adminId;
        this.cinemaId = cinemaId;
    }

    // Getters and Setters
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    // Methods
    public void insertFilm() {
       
    }

    public void deleteFilm() {
       
    }

    public void assignFilmToCinema() {
       
    }

    
}
