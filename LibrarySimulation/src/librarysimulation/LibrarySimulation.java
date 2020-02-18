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

    private static final String DOMAINS[] = {"edu", "com", "net", "org"};

    //private static Customer registerUser() throws Exception
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
        //Customer user;

        System.out.println("==============================");
        System.out.println("----  WELCOME, NEW USER   ----");
        System.out.println("==============================");

        while (flag) // name loop
        {
            System.out.println("Enter your name in 20 non-special characters or less: > ");
            name = console.nextLine().trim();
            if (checkValidName(name)) {
                flag = false;
            } else {
                System.out.println("Not a valid name.");
                name = "";
            }
        }

        flag = true;

        while (flag) //phone loop
        {
            System.out.println("Enter your phone number in the format XXX-XXXX: > ");
            phone = console.nextLine().trim();
            if (checkValidPhoneNumber(phone)) {
                flag = false;
            } else {
                System.out.println("Not a valid phone number.");
                name = "";
            }
        }

        flag = true;

        while (flag) //email loop
        {

        }

        flag = true;

        while (flag) //address loop
        {

        }

        flag = true;

        while (flag) //state loop
        {

        }

    }

    private static boolean checkValidPhoneNumber(String phone) {
        Pattern phoneNumber = Pattern.compile("(\\d{3})-(\\d{7})");
        Matcher correctPhoneNumber = phoneNumber.matcher(phone);

        if (correctPhoneNumber.find()) {
            return true;
        }

        return false;
    }

    private static boolean checkValidName(String name) // checks name if under 20
    // and no special chars
    {
        if (name.length() < 21 && name.length() >= 1) {
            Pattern specialChars = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher hasSpecialChars = specialChars.matcher(name);

            if (hasSpecialChars.find()) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean checkValidEmail(String email, String name) //checks if starts with recipients name < 8 char  then @. 5 char domain
    // then top lvl domain
    {

        Pattern emailPattern = Pattern.compile("^(.{1,8})@([A-Z, a-z]{1,5})\\.([a-z]{3})");
        Matcher correctEmail = emailPattern.matcher(email);

        if (name.length() > 8) {
            name = name.substring(0, 7);
        }
        if (email.startsWith(name)) {
            for (int i = 0; i < DOMAINS.length; i++) {
                if (email.endsWith(DOMAINS[i])) {
                    if (correctEmail.find()) {
                        return true;
                    }
                    else
                    {
                        System.out.println("Invalid email.");
                        return false;
                    }
                }
            }
            System.out.println("Invalid top level domain. Must be: .edu, .com, .net, or .org");
        }
        System.out.println("Email address does not start with your name.");
        return false;
    }

    public static void main(String[] args) {
        String test = "\\.27@hotm.edw";

        System.out.println(checkValidEmail(test, "Aaron"));

    }

}
