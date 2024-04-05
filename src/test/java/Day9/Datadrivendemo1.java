package Day9;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivendemo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new  FileInputStream(System.getProperty("user.dir") +"\\ExcelFiles\\Databook.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); //name
		
		//XSSFSheet sheet = workbook.getSheetAt(0); //index

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		System.out.println("The number of rows are ::" +rows);
		System.out.println("The number of columns are ::" +cols);
		
		for(int r= 0; r <rows; r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c= 0; c<cols; c ++)
			{
				//XSSFCell cellValue= currentRow.getCell(c);
				
				String cellValue= currentRow.getCell(c).toString();
				 System.out.println(cellValue + "  ");

			}
			
			 System.out.println();
		}
		
		workbook.close();
		file.close();
	}
}
