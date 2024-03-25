import java.util.*;
import java.io.*;

public class Reader extends User {
    ArrayList<String> currentList; 
    ArrayList<String> wantToRead;
    String search;
    Library library;
    String returnDate;
    String checkedBook;
    String bookTitle;
    String author;
    
    public Reader (Library library) {
        this.currentList = new ArrayList<String>();
        this.wantToRead = new ArrayList<String>();
        this.library = library;
    }
    
    public Reader (ArrayList<String> currentList, ArrayList<String> wantToRead) {
        this.currentList = currentList;
        this.wantToRead = wantToRead;
    }
    public void setCurrentList (ArrayList<String> currentList) {
        this.currentList = currentList;
    }
    
    public void setWantToRead (ArrayList<String> wantToRead) {
        this.wantToRead = wantToRead;
    }
    
    public ArrayList<String> getCurrentList () {
        return currentList;
    }
    
    public ArrayList<String> getWantToRead () {
        return wantToRead;
    }
    
    public void display () {
       //this.library.display();BufferedReader br = null;
        try {
            File fw = new File("AllBooks.txt"); // java.io.File
            FileReader fr = new FileReader(fw); // java.io.FileReader
            BufferedReader br = new BufferedReader(fr); // java.io.BufferedReader
            String line;
            System.out.println("Title        Author     Genre        Rating");
            System.out.println("----------------------------------------------");
            while ((line = br.readLine()) != null) {
              // process the line
            System.out.println(line);
            }
          }
          catch(IOException e) { e.printStackTrace();}
    }
    
    /*public void checkedDisplay(){
        BufferedReader br = null;
        try {
            File file = new File("CheckedOut.txt"); // java.io.File
            FileReader fr = new FileReader(file); // java.io.FileReader
            br = new BufferedReader(fr); // java.io.BufferedReader
            String line;
            System.out.println("Book");
            System.out.println("----------------");
            while ((line = br.readLine()) != null) {
              // process the line
            System.out.println(line);
            }
          }
          catch(IOException e) { e.printStackTrace();}
    }
    
    public String search (library) {
        System.out.println("What book title would you like to search for?");
        search = input.next();
        for()
    }*/
    
    public void checkout () {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Please enter the book title: " );
            checkedBook = input.nextLine();
            currentList.add(checkedBook);
            System.out.println("Please enter your return date:");
            returnDate = input.nextLine();

        }catch(InputMismatchException e) {
            System.out.println("ERROR!! - Invald data type.");
        }
        try{
                FileWriter fw = new FileWriter("CheckedOut.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(checkedBook);
                pw.print(returnDate);
                pw.flush();
            }
            catch(IOException e){
                System.out.println("ERROR!");
        }
        
    }
    
    public void wantToRead (){
       Scanner scan = new Scanner(System.in);
        System.out.println("Book Title: ");
        String bookTitle = scan.next();
        bookTitle.replaceAll(" ", "");
        System.out.println("Author: ");
        String author = scan.next();
        scan.close();

        try{
            FileWriter fw = new FileWriter("WillReadOneDay.txt", true); 
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter writer = new PrintWriter(bw);{
            writer.println("\n"+bookTitle+ "," +author);
            writer.close(); }
        } catch(IOException e){
            //e.printStackTrace();

        }   
    } 
    
}