package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment37 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create FileInputStream Object
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		//create respective file type object for getting data from property file
		Properties prop = new Properties();
		prop.load(fis);//call read method
		String url = prop.getProperty("url");
		System.out.println(url);
		
		//create FileInputStream Object for excel file 
		FileInputStream fis1 = new FileInputStream("./testdata/TestScriptDatas.xlsx");
		
		//create respective file type object for fetching data from excel file
		Workbook workbook = WorkbookFactory.create(fis1);
		String firstName = workbook.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
	   String lastName =workbook.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
	   String email = workbook.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
	   String password = workbook.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
	    String confirmPassword = workbook.getSheet("Register").getRow(1).getCell(4).getStringCellValue();	
	    
	   System.out.println(firstName);
	   System.out.println(lastName);
	   System.out.println(email);
		System.out.println(password);
		System.out.println(confirmPassword);
		
		
	}

}
