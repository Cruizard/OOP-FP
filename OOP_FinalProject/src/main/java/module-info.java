module com.example.oop_finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_finalproject to javafx.fxml;
    exports com.example.oop_finalproject;
}