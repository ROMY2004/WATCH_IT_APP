
package watchhub;

import watchhub.WATCHHUB.MOVIE;


/**
 *
 * @author romy
 */
public class Admin extends WATCHHUB.USER {
    MOVIE[] list_of_movies_marked=new MOVIE[5];// 5 can be changed
    MOVIE[] list_of_movies_watched=new MOVIE[5];// 5 can be changed

    @Override
    public void setPassword(String Password) {
        
    }

    @Override
    void setUsername(String Username) {

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
