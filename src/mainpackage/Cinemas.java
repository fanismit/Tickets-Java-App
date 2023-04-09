package mainpackage;

public class Cinemas {
    // Attributes
    private int cinemaId;
    private boolean cinemaIs3D;
    private int cinemaNumberOfSeats;
    private ArrayList<Films> films;

    // Constructor
    public Cinemas(int cinemaId, boolean cinemaIs3D, int cinemaNumberOfSeats) {
        this.cinemaId = cinemaId;
        this.cinemaIs3D = cinemaIs3D;
        this.cinemaNumberOfSeats = cinemaNumberOfSeats;
        this.films = new ArrayList<>();
    }

    // Getters and Setters
    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public boolean isCinemaIs3D() {
        return cinemaIs3D;
    }

    public void setCinemaIs3D(boolean cinemaIs3D) {
        this.cinemaIs3D = cinemaIs3D;
    }

    public int getCinemaNumberOfSeats() {
        return cinemaNumberOfSeats;
    }

    public void setCinemaNumberOfSeats(int cinemaNumberOfSeats) {
        this.cinemaNumberOfSeats = cinemaNumberOfSeats;
    }

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
