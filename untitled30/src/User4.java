import java.util.List;

class User4 extends User {
    private List<String> moviesWatched;
    private List<String> moviesToWatch;
    private String subscription;
    public User4 (String username, String password, String firstName, String lastName, String email, List<String> moviesWatched, List<String> moviesToWatch, String subscription) {
        super (username, password, firstName, lastName, email);
        this.moviesWatched = moviesWatched;
        this.moviesToWatch = moviesToWatch;
        this.subscription = subscription;
    }
    public List<String> getMoviesWatched () {
        return moviesWatched;
    }

    public void setMoviesWatched (List<String> moviesWatched) {
        this.moviesWatched = moviesWatched;
    }

    public List<String> getMoviesToWatch () {
        return moviesToWatch;
    }

    public void setMoviesToWatch (List<String> moviesToWatch) {
        this.moviesToWatch = moviesToWatch;
    }

    public String getSubscription () {
        return subscription;
    }

    public void setSubscription (String subscription) {
        this.subscription = subscription;
    }
    public void displayInfo () {
        // Print the user information
        System.out.println ("Username: " + getUsername ());
        System.out.println ("Password: " + getPassword ());
        System.out.println ("First name: " + getFirstName ());
        System.out.println ("Last name: " + getLastName ());
        System.out.println ("Email: " + getEmail ());
        System.out.println ("Movies watched: " + getMoviesWatched ());
        System.out.println ("Movies to watch: " + getMoviesToWatch ());
        System.out.println ("Subscription: " + getSubscription ());
    }
}
