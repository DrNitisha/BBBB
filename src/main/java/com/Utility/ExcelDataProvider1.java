package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider1 {
	XSSFWorkbook xs;
	public  ExcelDataProvider1() throws Exception {
	String filepath="C:\\Users\\verma\\eclipse-workspace\\BBBB\\Datanew\\data.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	XSSFWorkbook xs =new XSSFWorkbook(fis);
	}
	
	public String gm(String Sheet,int row,int cell) {
		return xs.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		
		}
	
}
	
