package demo1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public String[][] readExcel() throws IOException
	{
		File file=new File("G:\\data\\Preethi.xlsx");
		FileInputStream fin=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fin);
	XSSFSheet s1=wb.getSheet("Sheet1");
	Row row;
	
	Cell cell;
	//System.out.println(cell.getStringCellValue());
	int rowPresent=s1.getLastRowNum();
	System.out.println(rowPresent);
	String data[][]=null;
	for(int i=0;i<=rowPresent;i++){
		row=s1.getRow(i);
		for(int j=0;j<2;j++)
		{
			cell=row.getCell(j);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			
			data[i][j]=cell.getStringCellValue();
			
		}
		
	}
	return data;
	
	
	}
	
	public static void main(String[] args) throws IOException {
		ExcelRead er=new ExcelRead();
		er.readExcel();
	}

}
