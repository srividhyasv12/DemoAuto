package dataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) {
		 FileInputStream fis=new FileInputStream("./testdata/first.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 Sheet sheet=workbook.getSheet("sheet1");

		 //no.of rows
		 int rowNum = sheet.getPhysicalNumberOfRows();
		 //no.of columns
		 int coluMn
		 
}}
