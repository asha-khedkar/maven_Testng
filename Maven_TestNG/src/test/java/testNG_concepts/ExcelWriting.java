package testNG_concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriting {
	
	@Test
	public void writeExcel() throws IOException{
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("login");
		
		  Row row=sheet.createRow(4); 
		  Cell cell0 =row.createCell(5); 		  
		  Cell cell1 =row.createCell(6); 
		  cell0.setCellValue("Asha");
		  cell1.setCellValue("Khedkar");
			File f=new File("A:\\Excel.xlsx");		

		  try {
				FileOutputStream fos=new FileOutputStream(f);
				workbook.write(fos);
				fos.close();

		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
			  
		  		 

		
	}

}

