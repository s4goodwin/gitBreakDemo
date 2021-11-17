module com.example.gitbreakdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitbreakdemo to javafx.fxml;
    exports com.example.gitbreakdemo;
}