import java.util.*;
import java.io.*;

public class Library {
    ArrayList<Book> booksArray;
    
    public Library () {
        this.booksArray = new ArrayList<Book>();
    }
        
    public void loadLibrary (String fileName){
        Scanner display = new Scanner(System.in);
        String line = null;
        try
        {
            FileReader fReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                Book tempbook = new Book();
                String[] temp = line.split(",");
                for (String s : temp)
                    System.out.println(s);
                
                tempbook.setTitle(temp[0]);
                tempbook.setAuthor(temp[1]);
                tempbook.setGenre(temp[2]);
                String rating = temp[3].replaceAll(" ","");
                tempbook.setRating(Integer.parseInt(rating));
                this.booksArray.add(tempbook);
            }
            
            //close the file after its use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
        System.out.println(this.booksArray.size() + " this is the size of the library");
    }
    
    public void display () {
        for(Book tmp: this.booksArray) {
            System.out.println(tmp.getTitle());
        }
    }
    
    public ArrayList<String> getAllTitles () {
        ArrayList<String> temporary = new ArrayList<String>();
        for(Book tmp: this.booksArray) {
            String title = tmp.getTitle();
            temporary.add(title);
        }
        return temporary;
    }
    
    public ArrayList<Book> getLibrary() {
        return this.booksArray;
    }

}
