module com.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.base;


    opens com.example.demo3 to javafx.fxml;
    opens com.example.demo3.client to javafx.fxml;
    exports com.example.demo3.client;
}