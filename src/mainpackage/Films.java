package mainpackage;

public class Films {
    // Attributes
    private static int nextId = 0;
    private final int filmId;
    private String filmTitle;
    private String filmCategory;
    private String filmDescription;

    // Constructor
    public Films(String filmTitle, String filmCategory, String filmDescription) {
        this.filmId = nextId++;
        this.filmTitle = filmTitle;
        this.filmCategory = filmCategory;
        this.filmDescription = filmDescription;
    }

    // Getters
    public int getFilmId() {
        return filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public String getFilmCategory() {
        return filmCategory;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    // Methods
    public void viewFilmDetails() {
        System.out.println("Viewing film details.");
    }

    public void updateFilmDetails() {
        System.out.println("Updating film details.");
    }

    public void deleteFilm() {
        System.out.println("Deleting a film.");
    }

    public void viewAllFilms() {
        System.out.println("Viewing all films.");
    }

}