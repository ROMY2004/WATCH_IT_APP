import java.util.Date;

public class UserWatchRecord {
    private int userId;
    private String movie;
    private int rating;
    private Date date;

    public UserWatchRecord(int userId, String movie, int rating, Date date) {
        this.userId = userId;
        this.movie = movie;
        this.rating = rating;
        this.date = date;
    }
    public int getUserId() {
        return userId;
    }

    public String getMovie() {
        return movie;
    }

    public int getRating() {
        return rating;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;

}

    public void setDate(Date date) {
        this.date = date;
    }
}