module com.example.mangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mangogardenestate to javafx.fxml;
    exports com.example.mangogardenestate;
    exports com.example.mangogardenestate.Customer;
    opens com.example.mangogardenestate.Customer to javafx.fxml;
    exports Farmer;
    opens Farmer to javafx.fxml;
}