import java.util.*;
import java.io.*;

public class User {
    String userName; 
    String password; 
    
    public User () {
        userName = "Avni";
        password = "hello";
    }
    
    public User (String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public void setUserName (String userName) {
        this.userName = userName;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
    
}