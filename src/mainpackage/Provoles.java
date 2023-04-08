package mainpackage;
import java.time.LocalDate;

public class Provoles {
    // Attributes
    private int provoliID;
    private Films provoliFilm;
    private Cinemas provoliCinema;
    private LocalDate provoliStartDate;
    private LocalDate provoliEndDate;
    private int provoliNumberOfReservations;
    private boolean provoliIsAvailable;

    // Constructor
    public Provoles(int provoliID, Films provoliFilm, Cinemas provoliCinema, LocalDate provoliStartDate, LocalDate provoliEndDate,
                    int provoliNumberOfReservations, boolean provoliIsAvailable) {
        this.provoliID = provoliID;
        this.provoliFilm = provoliFilm;
        this.provoliCinema = provoliCinema;
        this.provoliStartDate = provoliStartDate;
        this.provoliEndDate = provoliEndDate;
        this.provoliNumberOfReservations = provoliNumberOfReservations;
        this.provoliIsAvailable = provoliIsAvailable;
    }

    // Getters and Setters
    public int getProvoliID() {
        return provoliID;
    }

    public void setProvoliID(int provoliID) {
        this.provoliID = provoliID;
    }

    public Films getProvoliFilm() {
        return provoliFilm;
    }

    public void setProvoliFilm(Films provoliFilm) {
        this.provoliFilm = provoliFilm;
    }

    public Cinemas getProvoliCinema() {
        return provoliCinema;
    }

    public void setProvoliCinema(Cinemas provoliCinema) {
        this.provoliCinema = provoliCinema;
    }

    public LocalDate getProvoliStartDate() {
        return provoliStartDate;
    }

    public void setProvoliStartDate(LocalDate provoliStartDate) {
        this.provoliStartDate = provoliStartDate;
    }

    public LocalDate getProvoliEndDate() {
        return provoliEndDate;
    }

    public void setProvoliEndDate(LocalDate provoliEndDate) {
        this.provoliEndDate = provoliEndDate;
    }

    public int getProvoliNumberOfReservations() {
        return provoliNumberOfReservations;
    }

    public void setProvoliNumberOfReservations(int provoliNumberOfReservations) {
        this.provoliNumberOfReservations = provoliNumberOfReservations;
    }

    public boolean isProvoliIsAvailable() {
        return provoliIsAvailable;
    }

    public void setProvoliIsAvailable(boolean provoliIsAvailable) {
        this.provoliIsAvailable = provoliIsAvailable;
    }

}
