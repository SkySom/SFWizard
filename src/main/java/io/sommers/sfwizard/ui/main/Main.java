package io.sommers.sfwizard.ui.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("mainpage.fxml"));
        Parent root = (Parent)loader.load();
        MainController controller = (MainController)loader.getController();
        controller.setStage(primaryStage);
        primaryStage.setTitle("SFWizard");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
