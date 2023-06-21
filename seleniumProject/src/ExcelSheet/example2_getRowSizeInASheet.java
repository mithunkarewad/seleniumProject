package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2_getRowSizeInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Daily Examples\\RevisionSession\\Selenium\\SeleniumRevisionC'wad.xlsx");		
		
		int rowSize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum() + 1;
		System.out.println(rowSize);
		
	}
}
