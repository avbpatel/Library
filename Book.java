import java.util.*;
import java.io.*;

public class Book extends Library {
    String title; 
    String author; 
    String genre;
    int rating; 
    
    public Book (){
        title = " ";
        author = " ";
        genre = " ";
        rating = 0;
    }
    
    public void setTitle(String title) {
        this.title= title;
    }
    
    public void setAuthor (String author) {
        this.author = author;
    }
    
    public void setGenre (String genre) {
        this.genre = genre;
    }
    
    public void setRating (int rating) {
        this.rating = rating;
    }
    
    public String getTitle () {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getRating() {
        return rating;
    }
    
}