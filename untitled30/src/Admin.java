class Admin extends User {
    public Admin (String username, String password, String firstName, String lastName, String email) {
        // Call the super constructor
        super (username, password, firstName, lastName, email);
    }


    public void displayInfo () {
        // Print the user information
        System.out.println ("Username: " + getUsername ());
        System.out.println ("Password: " + getPassword ());
        System.out.println ("First name: " + getFirstName ());
        System.out.println ("Last name: " + getLastName ());
        System.out.println ("Email: " + getEmail ());
        System.out.println ("Role: Admin");
    }
}
