import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String[] args) throws IOException {
		int female_count = 0;
		int male_count = 0;
		int st_total = 0;
		int total=0;
		List<List<Object>> sheetdata = new ArrayList<List<Object>>();
		File fileName = new File( "C:\\Users\\Lenovo\\Desktop\\HCL\\Corona data.xlsx" );
		FileInputStream file = new FileInputStream( fileName );
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator rows = sheet.rowIterator();
		while(rows.hasNext()) {
			XSSFRow row = (XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			List<Object> data = new ArrayList<>();
			while(cells.hasNext()) {
				XSSFCell cell = (XSSFCell) cells.next();
				data.add(cell);
			}
			sheetdata.add(data);
		} 
		for(int i = 1;i < sheetdata.size(); ) {
			if((i+1) < sheetdata.size() && ((sheetdata.get(i).get(0).toString().contentEquals (sheetdata.get(i+1).get(0).toString()))) ) {
				List list = (List) sheetdata.get(i);
				XSSFCell maleCell = (XSSFCell) list.get(2);
				male_count = (int) ( male_count + maleCell.getNumericCellValue() );
				XSSFCell femaleCell = (XSSFCell) list.get(3);
				female_count = (int) ( female_count + femaleCell.getNumericCellValue());
			    st_total = (int) (male_count + female_count);
			   }
			else {
				List list = (List) sheetdata.get(i);
				XSSFCell maleCell = (XSSFCell) list.get(2);
				male_count = (int) (male_count + maleCell.getNumericCellValue());
				XSSFCell femaleCell = (XSSFCell) list.get(3);
				female_count = (int) (female_count + femaleCell.getNumericCellValue());
			    st_total = (int) (male_count + female_count);	
			    total=total+st_total;
			    System.out.println(sheetdata.get(i).get(0) + " Total=" + st_total);
			    System.out.println(sheetdata.get(i).get(0) + " Male Total=" + male_count);
			    System.out.println(sheetdata.get(i).get(0) + " Female Total=" + female_count);
			    female_count = 0;
			    male_count = 0;
			    st_total = 0;
			    System.out.println();			
			}
			if(i<sheetdata.size()) {
				i++;
			}
			else {
				break;
			}
		}
		System.out.println("Total number of patients = "+total);
	
	}
	
	}


