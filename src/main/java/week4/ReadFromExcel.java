package week4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public String[][] getData(String filename) throws IOException 
	{
		//Open WorkBook
		XSSFWorkbook wBook = new XSSFWorkbook("./Excel/"+filename+".xlsx");
		//Go to Sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Get Total Physical No of Row Count (Total -1 starting from 1)
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Get Total Col Count (Total starting from 1)
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		System.out.println(colCount);
		//Get Data
		for (int i = 1; i <= rowCount; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			//Go to Cell
			for (int j = 0; j < colCount; j++) 
			{
				XSSFCell cell = row.getCell(j);
				//Read Data
				//String data = cell.getStringCellValue();
				data[i-1][j] = cell.getStringCellValue();				
			}			
		}
		wBook.close();
		return data;
	}
}
