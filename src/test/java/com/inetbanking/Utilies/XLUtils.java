package com.inetbanking.Utilies;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	static String Xlfile=".dir\\testData\\logindata.xlsx";
	static FileInputStream fi;
	static FileOutputStream fo;
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFRow row;
	static XSSFCell cell;
	
	public static int getRowCount(String Xlfile, String xlsheet) throws IOException {
		 fi= new FileInputStream(Xlfile);
		 wb= new XSSFWorkbook(fi);
		 ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}

	public static int getCellCount(String Xlfile, String xlsheet, int rownum) throws IOException {
		 fi= new FileInputStream(Xlfile);
		 wb= new XSSFWorkbook(fi);
		 ws = wb.getSheet(xlsheet);
		 row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();		
		wb.close();
		fi.close();
		return cellcount;
		
	}
	
	public static String getCellData(String Xlfile, String xlsheet, int rownum, int colnum) throws IOException {
		 fi= new FileInputStream(Xlfile);
		 wb= new XSSFWorkbook(fi);
		 ws = wb.getSheet(xlsheet);
		 row = ws.getRow(rownum);
		cell = row.getCell(colnum);	
		String data;
		DataFormatter formatter = new DataFormatter();
		String Celldata = formatter.formatCellValue(cell);
		wb.close();
		fi.close();
		return Celldata;
		
	}
	
	public static void setCellData(String Xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException {
		 fi= new FileInputStream(Xlfile);
		 wb= new XSSFWorkbook(fi);
		 ws = wb.getSheet(xlsheet);
		 row = ws.getRow(rownum);
		cell = row.createCell(colnum);	
		cell.setCellValue(data);
		 fo= new FileOutputStream(Xlfile);
		wb.write(fo);
		fi.close();
		fo.close();
		
		
		
	}
	
}
