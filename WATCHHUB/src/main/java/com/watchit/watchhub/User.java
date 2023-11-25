package com.watchit.watchhub;

import com.watchit.watchhub.WATCHHUB.MOVIE;
import com.watchit.watchhub.WATCHHUB.USER;
import com.watchit.watchhub.WATCHHUB.USER_WATCH_RECORD;

/**
 *
 * @author romy
 */
public class User extends WATCHHUB.USER {

    MOVIE[] list_of_movies_marked = new MOVIE[5];// 5 can be changed
    MOVIE[] list_of_movies_watched = new MOVIE[5];// 5 can be changed
    private USER_WATCH_RECORD[] user_watch_record = new USER_WATCH_RECORD[15];// 15 can be changed

    @Override
    public void setUsername(String Username) {

    }

    @Override
    public void setPassword(String Password) {

    }

    @Override
    public void setFirst_name(String First_name) {

    }

    @Override
    public void setLast_name(String Last_name) {

    }

    @Override
    public void setEmail(String Email) {

    }
}
