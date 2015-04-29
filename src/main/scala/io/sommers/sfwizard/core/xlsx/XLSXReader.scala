package io.sommers.sfwizard.core.xlsx

import java.io.File

import info.folone.scala.poi.Workbook
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
				getTranslationObjects(workbook)
			case Failure(workbook) =>
				println(workbook)
		}
	}

	def getTranslationObjects(workbook: Workbook) = {
		val sheets = workbook.sheets
		sheets.foreach(sheet => sheet.rows.foreach(row => row.cells.foreach(cell => println(cell.toString()))))
	}
}
