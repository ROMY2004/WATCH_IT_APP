package com.watchit.watchhub;

/**
 *
 * @author romy
 */
public class Main {

    public static void main(String[] args) {
        Initialize_The_Program();
    }

    public static void Initialize_The_Program() {
        java.awt.EventQueue.invokeLater(() -> {
            new Welcome_page().setVisible(true);
        });
        WATCHHUB.signuppage = new Sign_up_page();
        WATCHHUB.loginpage = new Log_in_page();
        WATCHHUB.watchhub = new WATCHHUB();
        WATCHHUB.watchhubpage = new watchhub_page();
    }

}
