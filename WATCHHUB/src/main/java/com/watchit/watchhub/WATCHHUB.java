package com.watchit.watchhub;

import java.util.Date;

public class WATCHHUB {

    public static WATCHHUB watchhub;
    public static Sign_up_page signuppage;
    public static Log_in_page loginpage;
    public static watchhub_page watchhubpage;

    public boolean Sign_Up() {

        return false;

    }

    public boolean Log_In() {

        return false;

    }

    public abstract class USER {

        public static int ID;
        String Username;
        String Password;
        String First_name;
        String Last_name;
        String Email;

        abstract void setUsername(String Username);

        abstract void setFirst_name(String First_name);

        abstract void setLast_name(String Last_name);

        abstract void setEmail(String Email);

        int getID() {
            return 0;
        }

        String getUsername() {
            return null;
        }

        String getPassword() {
            return null;
        }

        String getFirst_name() {
            return null;
        }

        String getLast_name() {
            return null;
        }

        String getEmail() {
            return null;
        }

        void setPassword(String Password) {
        }

        public MOVIE Search(Object obj) {
            return null;
        }

        public void Set_Add_To_List_marked(MOVIE movie_marked) {
        }

        public MOVIE Get_Add_To_List_marked() {
            return null;
        }

        public void Set_Add_To_List_Watched(MOVIE movie_watched) {

        }

        public MOVIE Get_Add_To_List_Watched() {
            return null;
        }

    }

    public interface SUBSCRIPTION {

        int User_ID = 0;
        float price_of_plan = 0;
        Date Start_date = null;

        void set_user_id(int user_Id);

        void set_price_of_plan(float price);

        void set_start_date(Date date);
    }

    public class MOVIE {

        public static int movie_id;
        private String movie_title;
        private Date release_date;
        private float budget;
        private float revenue;
        private String Poster;
        private float running_time;
        //list of cast
        private String genres;
        private String country;
        //director
        private String[] languages = new String[2];
        private int imdb_score;

        public int getMovie_id() {
            return 0;
        }

        private void setMovie_id(int movie_id) {

        }

        public String getMovie_title() {
            return null;
        }

        public void setMovie_title(String movie_title) {

        }

        public Date getRelease_date() {
            return null;
        }

        public void setRelease_date(Date release_date) {

        }

        public float getBudget() {
            return 0;
        }

        public void setBudget(float budget) {

        }

        public float getRevenue() {
            return 0;
        }

        public void setRevenue(float revenue) {

        }

        public String getPoster() {
            return null;
        }

        public void setPoster(String Poster) {

        }

        public float getRunning_time() {
            return 0;
        }

        public void setRunning_time(float running_time) {

        }

        public String getGenres() {
            return null;
        }

        public void setGenres(String genres) {

        }

        public String getCountry() {
            return null;
        }

        public void setCountry(String country) {

        }

        public String[] getLanguages() {
            return new String[0];
        }

        public void setLanguages(String[] languages) {

        }

        public int getImdb_score() {
            return 0;
        }

        public void setImdb_score(int imdb_score) {

        }
    }

    public class CAST {

        private String First_name;
        private String Last_name;
        private int Age;
        private String gender;
        private String nationality;
        MOVIE[] list_of_movies = new MOVIE[5];// 5 can be changed

        public String getFirst_name() {
            return First_name;
        }

        public void setFirst_name(String first_name) {
            First_name = first_name;
        }

        public String getLast_name() {
            return Last_name;
        }

        public void setLast_name(String last_name) {
            Last_name = last_name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public MOVIE[] getList_of_movies() {
            return list_of_movies;
        }

        public void setList_of_movies(MOVIE movie) {
            this.list_of_movies[0] = movie;// 0 must be changed to variable
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }

    public class DIRECTOR {

        private String First_name;
        private String Last_name;
        private int Age;
        private String gender;
        private String nationality;
        MOVIE[] list_of_movies = new MOVIE[5];// 5 can be changed

        public String getFirst_name() {
            return First_name;
        }

        public void setFirst_name(String first_name) {
            First_name = first_name;
        }

        public String getLast_name() {
            return Last_name;
        }

        public void setLast_name(String last_name) {
            Last_name = last_name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public MOVIE[] getList_of_movies() {
            return list_of_movies;
        }

        public void setList_of_movies(MOVIE movie) {
            this.list_of_movies[0] = movie;// 0 must be changed to variable
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }

    public class USER_WATCH_RECORD {

        private int User_id;
        private MOVIE movie = new MOVIE();
        private Date date_of_watching = new Date();
        private int rating;// 1  ==>  5

        public int getUser_id() {
            return User_id;
        }

        public void setUser_id(int user_id) {
            User_id = user_id;
        }

        public MOVIE getMovie() {
            return movie;
        }

        public void setMovie(MOVIE movie) {
            this.movie = movie;
        }

        public Date getDate_of_watching() {
            return date_of_watching;
        }

        public void setDate_of_watching(Date date_of_watching) {
            this.date_of_watching = date_of_watching;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }
}
