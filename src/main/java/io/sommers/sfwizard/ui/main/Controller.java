package io.sommers.sfwizard.ui.main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
	@FXML
	public Button xmlTranslatorButton;
	public Pane wizardPane;

	public void initialize() {
		xmlTranslatorButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				try {
					Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("xmltranslation.fxml"));
					wizardPane.getChildren().add(root);
				} catch (IOException ioException) {
					System.out.println(ioException.getStackTrace());
				}
			}
		});
	}
}
