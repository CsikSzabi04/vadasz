module com.example.vadasz2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vadasz2 to javafx.fxml;
    exports com.example.vadasz2;
}