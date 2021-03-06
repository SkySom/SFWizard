package io.sommers.sfwizard.ui.xmltranslator;

import io.sommers.sfwizard.core.xml.Translator;
import io.sommers.sfwizard.ui.BaseController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
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
	public Button xmlTranslationBeginButton;

	public TextField inputFileChooserTextField;
	public TextField translationFileChooserTextField;
	public TextField outputFileChooserTextField;

	public ProgressBar progressBar;

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

		xmlTranslationBeginButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				File inputFile = new File(inputFileChooserTextField.getText());
				File translationFile = new File(translationFileChooserTextField.getText());
				File outputDirectory = new File(outputFileChooserTextField.getText());

				Translator translator = new Translator();
				translator.translate(inputFile, translationFile, outputDirectory, progressBar);
			}
		});
	}
}
