package io.sommers.sfwizard.ui.main;

import io.sommers.sfwizard.ui.xmltranslator.XMLTranslator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MainController {
	@FXML
	public Button xmlTranslatorButton;
	public Pane wizardPane;

	public void initialize() {
		xmlTranslatorButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				XMLTranslator xmlTranslator = new XMLTranslator();
				xmlTranslator.load(wizardPane);
			}
		});
	}
}
