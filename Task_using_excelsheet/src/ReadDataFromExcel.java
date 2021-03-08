
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcel {

	private static final String Stname = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileName=new File("C:\\Users\\Lenovo\\Desktop\\Corona data.xlsx");
		FileInputStream file=new FileInputStream(fileName);
		XSSFWorkbook w=new XSSFWorkbook(file);
		XSSFSheet sheet=w.getSheetAt(0);
		for(Row row:sheet) {
			for(Cell cell:row) {
				if(cell.getCellType()==cell.CELL_TYPE_STRING) {
				System.out.print(cell.getStringCellValue()+"\t\t");
				}
				else{
					int val=(int) cell.getNumericCellValue();
					System.out.print(val+"\t");
				}
			}
			System.out.println();
		}
	}
}
//		Iterator<?> rows=sheet.rowIterator();
//		while(rows.hasNext()) {
//			XSSFRow row=(XSSFRow) rows.next();
//			Iterator<?> cells=row.cellIterator();
//			List<Object> data=new ArrayList<>();
//			while(cells.hasNext()) {
//				System.out.print();
//			}
//		}
//	}
//}
//			//sheetdata.add(data);
//		
//		int female_count=0;
//		int male_count=0;
//		int total=0;
//		for(int i=1;i<sheetdata.size();i++) {
//			List<?> l=(List<?>) sheetdata.get(i);
//			if((l.get(0).toString()).equalsIgnoreCase("Andhra Pradesh") ) {
//				XSSFCell maleCell = (XSSFCell) l.get(2);
//				male_count=(int) (male_count+maleCell.getNumericCellValue());
//				XSSFCell femaleCell = (XSSFCell) l.get(3);
//				female_count=(int) (female_count+femaleCell.getNumericCellValue());
//			    total=(int) (male_count+female_count);
//			}	
//		}
//			System.out.println("AP Total="+total);
//			System.out.println("AP Male Total="+male_count);
//			System.out.println("AP Female Total="+female_count);
//
//}
//}
//
