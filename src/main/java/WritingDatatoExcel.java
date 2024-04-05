import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatatoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") +"\\ExcelFiles\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		//Without for loop
		
	/*	XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Welcome");
		row.createCell(1).setCellValue("To");
		row.createCell(2).setCellValue("Java");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("To");
		row1.createCell(2).setCellValue("Selenium");*/
		
		
		//for loop
		Scanner sc = new Scanner(System.in);
		
		for(int r=0; r<3; r++) 
		{
			XSSFRow currentRow = sheet.createRow(r);
			
			for(int c=0; c<4; c++)
			{
				System.out.println("Enter the value of the cell");
				String data = sc.next();
				currentRow.createCell(c).setCellValue(data);
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing of file is completed");


	}

}
