package io.sommers.sfwizard.core.xlsx

import java.io.File

import info.folone.scala.poi.impure.load

import scala.util.{Failure, Success, Try}

/**
 * Created by Skylar on 4/23/2015.
 */
class XLSXReader {
	def read(inputFile: File): Unit = {
		var tryWorkbook = Try(load(inputFile.getAbsolutePath))
		tryWorkbook match {
			case Success(workbook) =>
				println(workbook)
			case Failure(workbook) =>
				println(workbook)
		}
	}
}
