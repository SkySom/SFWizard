package io.sommers.sfwizard.core.xml

import java.io.File
import scala.util.Try
import scala.xml._

/**
 * Created by Skylar on 4/23/2015.
 */
class Reader {
	def read(file:File) = {
		var stringbuilder = new StringBuilder()
		val xml = Try(XML.loadFile(file))
		var topLevelElem = xml.
	}
}
