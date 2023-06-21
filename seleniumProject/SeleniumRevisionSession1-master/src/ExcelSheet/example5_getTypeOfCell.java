package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_getTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Daily Examples\\RevisionSession\\Selenium\\SeleniumRevisionC'wad.xlsx");		
	
	  CellType s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getCellType();
	  System.out.println(s1);
		
	}
}
