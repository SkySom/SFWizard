package io.sommers.sfwizard.ui.xmltranslator;

import io.sommers.sfwizard.ui.BaseController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;


/**
 * Created by Skylar on 4/23/2015.
 */
public class XMLTranslatorController extends BaseController {
	@FXML
	public Button inputFileChooserButton;
	public Button translationFileChooserButton;
	public Button outputFileChooserButton;
	public TextField inputFileChooserTextField;
	public TextField translationFileChooserTextField;
	public TextField outputFileChooserTextField;

	private FileChooser fileChooser = new FileChooser();
	private DirectoryChooser directoryChooser = new DirectoryChooser();

	public void initialize() {
		inputFileChooserButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				File file = fileChooser.showOpenDialog(getStage());
				if(file != null) {
					inputFileChooserTextField.setText(file.getAbsolutePath());
				}
			}
		});

		translationFileChooserButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				File file = fileChooser.showOpenDialog(getStage());
				if(file != null) {
					translationFileChooserTextField.setText(file.getAbsolutePath());
				}
			}
		});

		outputFileChooserButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				File file = directoryChooser.showDialog(getStage());
				if(file != null) {
					outputFileChooserTextField.setText(file.getAbsolutePath());
				}
			}
		});
	}
}
