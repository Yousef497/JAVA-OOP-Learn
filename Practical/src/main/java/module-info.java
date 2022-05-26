module com.example.practical {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practical to javafx.fxml;
    exports com.example.practical;
}