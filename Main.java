import java.io.*;
import java.util.*;


public class Main {
    public static Library library;
    public static Reader reader;
	public static void main (String[] args) {
		//Librarian librarian;
	    library = new Library();
		
		userlogin();
	}
    //create login function to enter program 
    public static void userlogin() {
		int reader_choice = 0;
		String readerUserName = "12345";
		String readerPassWord = "12345";
		String librarianUserName = "00000";
		String librarianPassWord = "00000";
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your username: ");
		String username = input.nextLine();
		
        Scanner input2 = new Scanner (System.in);
		System.out.println("Please enter your password:");
		String password = input2.nextLine();
        Reader reader=null; 
        Librarian librarian=null;
		if (username.equals(readerUserName) && password.equals(readerPassWord)) {
			System.out.println("Welcome Reader!");
		    reader = new Reader(library);
		}
		else if (username.equals(librarianUserName) && password.equals(librarianPassWord)) {
			System.out.println("Welcome Librarian!");
			librarian = new Librarian(library);
		}
		else if (password.equals(readerPassWord)) 
			System.out.println("Invalid Credentials");
		else
			System.out.println("Please try again");
	
	    if(reader !=null) {
    
            while(true) {
                System.out.println ("1) See all books");		
        		System.out.println ("2) Checkout a book");	
        		System.out.println ("3) Add to list");
        		System.out.println ("4) Exit ");
        		System.out.println ("---------------------------------------");
        		System.out.println ("Please enter your choice: ");	
                reader_choice = input.nextInt();
                switch(reader_choice) {
            	case 1: 
            	    reader.display();
            	    break;
            	case 2: 
            	    reader.checkout();
            	    break;
            	case 3: 
            	    reader.wantToRead();
            	    break;
            	
            	case 4: 
            	    return;
            	    
            	default:
            	    return;
                } // end switch
	        } // end while
        } // end if 
	
    	else if (librarian != null) {
    	    reader = new Reader(library);
    	    
            while(true){
                System.out.println ("1) See all lib books");		
    		    System.out.println ("2) Purchase a book");	
    		    System.out.println ("3) How many books are in the library?");
    		    System.out.println ("4) Exit");
    		    System.out.println ("---------------------------------------");
    		    System.out.println ("Please enter your choice: ");
                reader_choice = input.nextInt();
                switch(reader_choice) {
            	case 1: 
            	    reader.display();
            	    break;
            		
            	case 2: 
            	    librarian.purchase();
            	    break;
            	    
            	case 3:
            	    library.loadLibrary("AllBooks.txt");
            	    break;
            	    
            	case 4: 
            	    return;
                } // end switch
            } // end while
    	} // end else if
    } // end function
}	
