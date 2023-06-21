package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getNumericData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Daily Examples\\RevisionSession\\Selenium\\SeleniumRevisionC'wad.xlsx");		
		
		
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(value);
	}

}
