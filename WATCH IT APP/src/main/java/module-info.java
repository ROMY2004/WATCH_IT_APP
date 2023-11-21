module com.watchit.watch_it_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.watchit.watch_it_app to javafx.fxml;
    exports com.watchit.watch_it_app;
}