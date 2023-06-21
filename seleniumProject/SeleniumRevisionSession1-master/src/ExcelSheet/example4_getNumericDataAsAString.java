package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_getNumericDataAsAString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Daily Examples\\RevisionSession\\Selenium\\SeleniumRevisionC'wad.xlsx");		
				
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
	
		System.out.println(value);
		
	}
}
