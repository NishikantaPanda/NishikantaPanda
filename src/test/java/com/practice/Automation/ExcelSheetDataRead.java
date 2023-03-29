package com.practice.Automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetDataRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Step 1: Open the document in java readable format
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		// Step 2: Create a workbook 
		
		Workbook wb = WorkbookFactory.create(fis);
		
		// Step 3: Get control of sheet
		
		Sheet sh = wb.getSheet("Sheet1");
		
		// Step 4: Get control of row
		
		Row ro = sh.getRow(0);
		
		// Step 5: Select cell from row
		
		Cell cell = ro.getCell(2);
		
		// Step 6: Select cell value
		
		String value = cell.getStringCellValue();
		
		// Step 7: Print it
		
	
		// ----> Steps to write data into Excel Sheet
		
		  FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		  
		  //Create a cell
		  Cell newCell = ro.createCell(3);
		  
		  //Set cell value
		  newCell.setCellValue("Location");
		  
		  // Get Cell Value
		  String result = newCell.getStringCellValue();
		 
		  // Change the row
		  ro=sh.getRow(1);
		  
		  //Create a new  cell
		  Cell newCell2 = ro.createCell(3);
		  
		  // Set cell value
		  newCell2.setCellValue("Nagaland");
		  
		  // Get the cell value
		  String result2 = newCell2.getStringCellValue();
		  
		  // Write the Data into Excel sheet
		  wb.write(fos);
		  
		  // Print the results
		  System.out.println(result+" "+value+" "+result2);
		 
		// Close File 
		fis.close();
	}
}
