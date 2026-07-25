module com.example.mangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mangogardenestate to javafx.fxml;
    exports com.example.mangogardenestate;
    exports com.example.mangogardenestate.EstateOwner;
    opens com.example.mangogardenestate.EstateOwner to javafx.fxml;
    exports com.example.mangogardenestate.gardenManager;
    opens com.example.mangogardenestate.gardenManager to javafx.fxml;
}