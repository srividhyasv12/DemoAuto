package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToreadDatafromExcelInFormat {

	public static String  toReadStringData(String filename, String sheetname, int row, int col) throws IOException {
		 FileInputStream fis=new FileInputStream("./testdata/"+filename+".xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 return workbook.getSheet(sheetname).getRow(row).getCell(col).toString();
		 }
	
	public static int toReadInData(String filename, String sheetname, int row,int col) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("./testdata/"+filename+".xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 return (int) workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
		 }

}