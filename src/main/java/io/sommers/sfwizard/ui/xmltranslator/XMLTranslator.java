package io.sommers.sfwizard.ui.xmltranslator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Skylar on 4/23/2015.
 */
public class XMLTranslator {
	public void load(Pane parentPane, Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("xmltranslation.fxml"));
			Parent root = (Parent)loader.load();
			XMLTranslatorController controller = (XMLTranslatorController)loader.getController();
			controller.setStage(stage);
			parentPane.getChildren().removeAll();
			parentPane.getChildren().add(root);
		} catch (IOException ioException) {
			System.out.println(ioException.getStackTrace());
		}
	}
}
