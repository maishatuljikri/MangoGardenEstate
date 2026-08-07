package com.example.mangogardenestate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override

    public void start(Stage stage) throws IOException {

        var url = HelloApplication.class.getResource(
                "/com/example/mangogardenestate/maisha2330841/customer_controller/Product ReviewsView.fxml"
        );

        System.out.println(url);

        FXMLLoader loader = new FXMLLoader(url);

        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }
}
