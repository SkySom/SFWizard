package io.sommers.sfwizard.ui.xmltranslator;

import io.sommers.sfwizard.ui.BaseController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;


/**
 * Created by Skylar on 4/23/2015.
 */
public class XMLTranslatorController extends BaseController {
	@FXML
	public Button inputFileChooserButton;

	public void initialize() {
		inputFileChooserButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				FileChooser fileChooser = new FileChooser();
				fileChooser.showOpenDialog(getStage());
			}
		});
	}
}
