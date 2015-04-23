package io.sommers.sfwizard.ui.xmltranslator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * Created by Skylar on 4/23/2015.
 */
public class XMLTranslator {
	public void load(Pane parentPane) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("xmltranslation.fxml"));
			parentPane.getChildren().removeAll();
			parentPane.getChildren().add(root);
		} catch (IOException ioException) {
			System.out.println(ioException.getStackTrace());
		}
	}
}
