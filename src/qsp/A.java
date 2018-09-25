package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class A {
	public static void main(String[] args) throws Exception {
		Workbook w=WorkbookFactory.create(new File("./data/book2.xlsx"));
		 String v = w.getSheet("sheet1").getRow(0).getCell(0).toString();
		 Reporter.log("test is Excecuted",true);
	}

}
