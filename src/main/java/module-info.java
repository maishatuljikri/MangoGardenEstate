module com.example.mangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.mangogardenestate to javafx.fxml;
    exports com.example.mangogardenestate;

    exports com.example.mangogardenestate.Shahriar_2430840.EstateOwner;
    opens com.example.mangogardenestate.Shahriar_2430840.EstateOwner to javafx.fxml;

    exports com.example.mangogardenestate.Shahriar_2430840.gardenManager;
    opens com.example.mangogardenestate.Shahriar_2430840.gardenManager to javafx.fxml;

    opens com.example.mangogardenestate.maisha2330841.farmer_controller to javafx.fxml;
    opens com.example.mangogardenestate.maisha2330841.customer_controller to javafx.fxml;

    exports com.example.mangogardenestate.Sean_2412489.Accountant;
    opens com.example.mangogardenestate.Sean_2412489.Accountant to javafx.fxml;

    exports com.example.mangogardenestate.Sean_2412489.TransportOfficer;
    opens com.example.mangogardenestate.Sean_2412489.TransportOfficer to javafx.fxml;



}
