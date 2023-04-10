package mainpackage.films;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Films {
    // Attributes
    private static int nextId =0;
    private final int filmId;
    private String filmTitle;
    private String filmCategory;
    private String filmDescription;

    // Constructor
    public Films(String filmTitle, String filmCategory, String filmDescription) {
    	updateNetxId();
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
    public void updateNetxId() {
   	 // Read Films.txt file
       try (BufferedReader br = new BufferedReader(new FileReader("Films.txt"))) {
           String line;
           String lastFilmId = "";
           while ((line = br.readLine()) != null) {
               if (line.contains("Film ID:")) {
                   lastFilmId = line.substring(line.indexOf(":") + 1).trim();
               }
           }

           // Update nextId with last film ID
           if (!lastFilmId.isEmpty()) {
               nextId = Integer.parseInt(lastFilmId) + 1;
           }

       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}