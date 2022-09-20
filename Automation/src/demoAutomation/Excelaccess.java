package demoAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelaccess {
	
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			//FatchdataSingleData("C:\\Users\\Ashish\\Documents\\seleniumusedata.xlsx","akshay", 1, 0);
			fatchalldata("D:\\Automation setup\\Excel File\\TestCases- API.xlsx", "Sheet1");	
			
		}
	public static void FatchdataSingleData(String excelfilepath,String sheetname,int i,int j) throws EncryptedDocumentException, IOException
	{

		FileInputStream file= new  FileInputStream(excelfilepath);
		 Sheet sheet= WorkbookFactory.create(file).getSheet(sheetname);
		 String value=sheet.getRow(i).getCell(j).getStringCellValue();
		 System.out.println(value);
	}

	public static void fatchalldata(String exclefilepath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new  FileInputStream(exclefilepath);
		 Sheet sheet= WorkbookFactory.create(file).getSheet(sheetname);
		 int totalrow= sheet.getLastRowNum()+1;
		 for(int i=0;i<totalrow;i++)
		 {
			 Row row=sheet.getRow(i);
			 
			 for(int j=0;j<row.getLastCellNum();j++)
			 {
				 System.out.print(row.getCell(j).toString()+" | ");
			 }
			 System.out.println();
		 }
	}

}
