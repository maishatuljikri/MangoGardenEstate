module com.example.mangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mangogardenestate to javafx.fxml;
    exports com.example.mangogardenestate;
    exports com.example.mangogardenestate.Shahriar_2430840.EstateOwner;
    opens com.example.mangogardenestate.Shahriar_2430840.EstateOwner to javafx.fxml;
    exports com.example.mangogardenestate.Shahriar_2430840.gardenManager;
    opens com.example.mangogardenestate.Shahriar_2430840.gardenManager to javafx.fxml;
}