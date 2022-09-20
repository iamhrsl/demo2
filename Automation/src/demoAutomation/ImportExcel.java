package demoAutomation;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ImportExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, FileNotFoundException {
		
//		String path = "D:\\Automation setup\\Excel File\\Book1.xlsx";
//		FileInputStream file=new FileInputStream(path);
//		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(value);
		
		String path ="D:\\Automation setup\\Excel File\\Group 5_AmazonCartTestCases 3.xlsx";
		FileInputStream file=new FileInputStream(path);
		Sheet value=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int i=value.getLastRowNum();
		int j=value.getRow(0).getLastCellNum();
		
		System.out.println(i);
		System.out.println(j);
		
		for(int k=0;k<i;k++)
		{
			
			for(int m=0;m<j;m++)
			{
				String  r=value.getRow(k).getCell(m).getStringCellValue();
				System.out.print(r+"  ");
			}
			System.out.println();
		}
	}

}
