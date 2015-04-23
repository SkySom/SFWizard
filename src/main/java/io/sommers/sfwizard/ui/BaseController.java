package io.sommers.sfwizard.ui;

import javafx.stage.Stage;

/**
 * Created by Skylar on 4/23/2015.
 */
public class BaseController {
	private Stage stage;

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Stage getStage() {
		return this.stage;
	}
}
