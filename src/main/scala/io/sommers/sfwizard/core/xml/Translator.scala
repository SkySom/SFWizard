package io.sommers.sfwizard.core.xml

import java.io.File
import javafx.scene.control.ProgressBar

import io.sommers.sfwizard.core.xlsx.XLSXReader


/**
 * Created by Skylar on 4/23/2015.
 */
class Translator {
	def translate(inputFile:File, translationFile:File, outputDirectory:File, progressBar:ProgressBar) : Unit = {
		if(inputFile != "" && translationFile != "" && outputDirectory != "") {
			var xmlReader = new XMLReader
			var readfile = xmlReader.read(inputFile)
			var stringbuilder = new StringBuilder
			if(readfile != null) {
				val fieldDefinitions = (readfile \ "field-definition")
				val xlsx =  new XLSXReader
				xlsx.read(translationFile)
			} else {
				println("File is null")
			}
		} else {
			println("You must enter all the fields")
		}
	}
}
