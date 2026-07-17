module com.example.mangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mangogardenestate to javafx.fxml;
    exports com.example.mangogardenestate;
}