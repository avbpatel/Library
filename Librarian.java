import java.util.*;
import java.io.*;

public class Librarian extends User{
    ArrayList<Book> libBooks; 
    String bookTitle; 
    String author;
    String genre;
    int rating; 
    
    
    public Librarian (Library library) {
        this.libBooks = library.getLibrary();
    }
    
    
    public void purchase (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Book Title: ");
        String bookTitle = scan.nextLine();
        bookTitle.replaceAll(" ", "");
        System.out.println("Author: ");
        String author = scan.nextLine();
        System.out.println("Genre: ");
        String genre = scan.nextLine();
        System.out.println("Rating: ");
        int rating = scan.nextInt();

        try{
            FileWriter fw = new FileWriter("AllBooks.txt", true); 
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter writer = new PrintWriter(bw);{
            writer.println(bookTitle+ "," +author+ "," +genre + "," + rating);
            writer.close(); }
        } catch(IOException e){
            e.printStackTrace();

        }   
    }
    
}
