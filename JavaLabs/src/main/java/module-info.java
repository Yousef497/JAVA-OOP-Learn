module com.example.javalabs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalabs to javafx.fxml;
    exports com.example.javalabs;
}