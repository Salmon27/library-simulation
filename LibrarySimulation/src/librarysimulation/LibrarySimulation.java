/*
 AJ and Joey
 CMPSC 222
 2/6/2020
 This program is the main class of the LibrayrSimulation Project.
 */
package librarysimulation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LibrarySimulation {

    private static Customer registerUser() throws Exception
    // This method prompts the user to enter Customer information, validates
    // it, and then returns the new Customer. If the customer quits at any time,
    // it throws an exception
    {
        Scanner console = new Scanner(System.in);
        boolean flag = true;
        String name;
        String phone;
        String email;
        String addr;
        String state;
        Customer user;
        
        System.out.println("==============================");
        System.out.println("----  WELCOME, NEW USER   ----");
        System.out.println("==============================");
        
        while(flag) // name loop
        {
            System.out.println("Enter your name in 20 non-special characters or less: > ");
            name = console.nextLine().trim();
            if (checkValidName(name))
                flag = false;
            else
            {
                System.out.println("Not a valid name.");
                name = "";
            }
        }
        
        flag = true;
        
        while(flag) //phone loop
        {
            
        }
        
        flag = true;
        
        while(flag) //email loop
        {
            
        }
        
        flag = true;
        
        while(flag) //address loop
        {
            
        }
        
        flag = true;
        
        while(flag) //state loop
        {
            
        }
        
  
    }
    
    
    private static boolean checkValidPhoneNumber(String phone)
    {
        Pattern phoneNumber = Pattern.compile("\\d{3}-\\d{7}");
        Matcher correctPhoneNumber = phoneNumber.matcher(phone);
        
        if (correctPhoneNumber.find())
        {
            return true;
        }
        
        return false;
    }
    
    
    private static boolean checkValidName(String name) // checks name if under 20
                                                       // and no special chars
    {
        if (name.length() < 21) 
        {
            Pattern specialChars = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher hasSpecialChars = specialChars.matcher(name);
            
            if(hasSpecialChars.find())
                return false;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
