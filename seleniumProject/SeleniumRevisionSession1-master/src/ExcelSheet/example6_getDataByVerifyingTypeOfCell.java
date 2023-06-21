package ExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_getDataByVerifyingTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		

		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Daily Examples\\RevisionSession\\Selenium\\SeleniumRevisionC'wad.xlsx");		
		
		 Cell data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0);
	
		CellType type = data.getCellType();
		
		if(type==CellType.STRING)
		{
			String value = data.getStringCellValue();
			System.out.println(value);
		}
		else if (type==CellType.NUMERIC) 
		{
			double value = data.getNumericCellValue();
			System.out.println(value);
		} 
		else if(type==CellType.BOOLEAN)
		{
				boolean value = data.getBooleanCellValue();
				System.out.println(value);
		}
		
		
		
	}
}
