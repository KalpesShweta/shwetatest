package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static String[][] getDataArray(String datatable, String worksheet) throws IOException {
		// get the excel path
		File xlFile = new File(datatable);

		// access the xlpath
		FileInputStream xlDoc = new FileInputStream(xlFile);

		// access the workbook below is used for .xls file
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);

		// use below for .xlsx file
		// XSSFWorkBook wb=new XSSFWorkBook(xlDoc);

		// access the sheet
		HSSFSheet sheet = wb.getSheet(worksheet);
		int row = sheet.getLastRowNum() + 1;// sheet.getPhysicalNumberOfRows(); //both ways are correct
		int column = sheet.getRow(0).getLastCellNum();// sheet.getRow(0).getPhysicalNumberOfCells(); //both ways are
														// correct
		String[][] array = new String[row][column];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < column; j++) {
				try
				{
				array[i][j] = sheet.getRow(i).getCell(j).toString();
				}
				catch(Exception ex)
				{
				
				}
				// String val= sheet.getRow(i).getCell(j).getStringCellValue();
				// System.out.print(val+" ");
			}
			// System.out.println();
		}
		return array;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	String dt_Path = "/Users/kalpeshpatel/Documents/TestData.xls";//"/Users/kalpeshpatel/Documents/WebEx/TestData.xls";
		//String dt_Path ="/Users/kalpeshpatel/Documents/Book7.xls";// "/Users/kalpeshpatel/Documents/TestDataForSaleForce/TestCase1.xls";
		String[][] result = getDataArray(dt_Path, "Sheet1");

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
