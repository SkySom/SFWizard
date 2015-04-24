package io.sommers.sfwizard.core.xml

import java.io.File
import scala.util.{Failure, Success, Try}
import scala.xml._

/**
 * Created by Skylar on 4/23/2015.
 */
class XMLReader {
	def read(file:File) : Elem = {
		var stringbuilder = new StringBuilder()
		val tryXML = Try(XML.loadFile(file))
		tryXML match {
			case Success(xml) =>
				return xml
			case Failure(xml) =>
				return null;
		}
	}
}
