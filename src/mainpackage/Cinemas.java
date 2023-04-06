package mainpackage;

public class Cinemas {
    // Attributes
    private int cinemaId;
    private boolean cinemaIs3D;
    private int cinemaNumberOfSeats;

    // Constructor
    public Cinemas(int cinemaId, boolean cinemaIs3D, int cinemaNumberOfSeats) {
        this.cinemaId = cinemaId;
        this.cinemaIs3D = cinemaIs3D;
        this.cinemaNumberOfSeats = cinemaNumberOfSeats;
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

}
