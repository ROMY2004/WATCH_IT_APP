
package watchhub;

import java.util.Date;

/**
 *
 * @author romy
 */
    public interface SUBSCRIPTION {

        int User_ID = 0;
        float price_of_plan = 0;
        Date Start_date = null;

        void set_user_id(int user_Id);

        void set_price_of_plan(float price);

        void set_start_date(Date date);
    }
