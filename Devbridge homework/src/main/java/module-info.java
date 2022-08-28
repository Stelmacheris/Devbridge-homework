module com.example.devbridgehomework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devbridgehomework to javafx.fxml;
    exports com.example.devbridgehomework;
}