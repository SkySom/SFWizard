package io.sommers.sfwizard.core.xml

import java.io.File
import javafx.scene.control.ProgressBar


/**
 * Created by Skylar on 4/23/2015.
 */
class Translator {
	def translate(inputFile:File, translationFile:File, outputDirectory:File, progressBar:ProgressBar) = {
		var reader = new Reader
		reader.read(inputFile)
	}
}
