package com.framework.utility;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(){
		
		File src = new File("./TestData/TestData.xlsx");
		try {
			wb = new XSSFWorkbook(src);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getStringData(String sheetName,int row,int col){
		
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		
	}
	
	public String getStringData(int sheetIndex,int row,int col){
		
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		
	}

	public double getNumaricData(String sheetName,int row,int col){
		
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
		
	}
	
	public double getNumaricData(int sheetIndex,int row,int col){
		
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getNumericCellValue();
		
	}

	
}
