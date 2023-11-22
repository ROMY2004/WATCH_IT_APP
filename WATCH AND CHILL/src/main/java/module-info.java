module com.watchit.watch_and_chill {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.watchit.watch_and_chill to javafx.fxml;
    exports com.watchit.watch_and_chill;
}