package seriesassignment; 

 

import java.util.Objects; 

 

public class Series { 

    public final int id;  // ID for Series 

    public String name; 

    public String genre; //  

    public int ageRestriction; 

    public int numEpisodes; 

 

    public Series(int id, String name, String genre, int ageRestriction, int numEpisodes) { 

        this.id = id; 

        this.name = name; 

        this.genre = genre; 

        this.ageRestriction = ageRestriction; 

        this.numEpisodes = numEpisodes; 

    } 

 

    // Getters for Input details 

    public int getId() { return id; } 

    public String getName() { return name; } 

    public String getGenre() { return genre; } 

    public int getAgeRestriction() { return ageRestriction; } 

    public int getNumEpisodes() { return numEpisodes; } 

 

    // Setters for Series 

    public void setName(String name) { this.name = name; } 

    public void setGenre(String genre) { this.genre = genre; } 

    public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; } 

    public void setNumEpisodes(int numEpisodes) { this.numEpisodes = numEpisodes; } 

 

    @Override 

    public String toString() { 

        return String.format( 

            "SERIES ID: %d%nSERIES NAME: %s%nGENRE: %s%nAGE RESTRICTION: %d%nNUMBER OF EPISODES: %d%n", 

            id, name, genre, ageRestriction, numEpisodes 

        ); 

    } 

 

    @Override 

    public boolean equals(Object o) { 

        if (this == o) return true; 

        if (!(o instanceof Series)) return false; 

        Series series = (Series) o; 

        return id == series.id; 

    } 

 

    @Override 

    public int hashCode() { 

        return Objects.hash(id); 

    } 

} 