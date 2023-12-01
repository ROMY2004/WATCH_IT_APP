import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        System.out.println ("How many users do you want to add?");
        int n = sc.nextInt ();
        sc.nextLine ();
        for (int i = 0; i < n; i++) {
            System.out.println ("What type of user do you want to add? (User4 or Admin)");
            String type = sc.nextLine ();


            System.out.println ("Enter the username:");
            String username = sc.nextLine ();
            System.out.println ("Enter the password:");
            String password = sc.nextLine ();
            System.out.println ("Enter the first name:");
            String firstName = sc.nextLine ();
            System.out.println ("Enter the last name:");
            String lastName = sc.nextLine ();
            System.out.println ("Enter the email:");
            String email = sc.nextLine ();
            if (type.equalsIgnoreCase ("User4")) {
                System.out.println ("Enter the movies watched (separated by commas):");
                String moviesWatched = sc.nextLine ();
                System.out.println ("Enter the movies to watch (separated by commas):");
                String moviesToWatch = sc.nextLine ();
                System.out.println ("Enter the subscription (Premium, Basic, or standard):");
                String subscription = sc.nextLine ();
                User4 user = new User4 (username, password, firstName, lastName, email, Arrays.asList (moviesWatched.split (",")), Arrays.asList (moviesToWatch.split (",")), subscription);
                users.add (user);
            } else if (type.equalsIgnoreCase ("Admin")) {
                Admin admin = new Admin (username, password, firstName, lastName, email);
                users.add (admin);
            } else {
                System.out.println ("Invalid type of user.");
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream ("users_dat.txt");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            oos.writeObject (users);
            oos.close ();
            fos.close ();
            System.out.println ("Data saved to the file.");
        } catch (IOException e) {
            System.out.println ("Error saving the data.");
        }
    }
}
