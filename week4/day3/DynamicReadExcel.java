package week4.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicReadExcel {

	public static String[][] readData(String filename) throws IOException{
		//Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+filename+".xlsx");

		//Open WorkSheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To get the number of rows
		int rowCount = ws.getLastRowNum();
		System.out.println("Row count is :"+rowCount);
		
		//To count the number of columns
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println("Column count is: "+columnCount);
		
		//Declare 2D String Array
		String[][] data = new String[rowCount][columnCount];
		
		for ( int i = 0 ; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			  for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				data[i-1][j] = allData;
			}
		}
		wb.close();
		return data;
	}
}
