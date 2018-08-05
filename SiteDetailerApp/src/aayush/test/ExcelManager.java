/**
 * 
 */
package aayush.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author aayush.n
 *
 */
public class ExcelManager {

	public void generateExcel(LinkedHashMap<String,String>list) throws IOException {
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("WebSite Details");

		Font headerFont=workbook.createFont();

		headerFont.setBold(true);
		headerFont.setColor(IndexedColors.RED.getIndex());
		headerFont.setFontHeight((short)13);

		CellStyle headerCellStyle=workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		Row headerRow=sheet.createRow(0);

		for(int i=0;i<list.size();i++) {
			Cell cell=headerRow.createCell(i);
			cell.setCellValue(list.keySet().toArray()[i].toString());
			cell.setCellStyle(headerCellStyle);
		}

		int rowNum=1;

		for(int i=0;i<list.size();i++) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(i).setCellValue(list.get(i));
			sheet.autoSizeColumn(i);
		}
		
		FileOutputStream fileOut = new FileOutputStream("websiteDetailer.xlsx");

		workbook.write(fileOut);

		fileOut.close();

	}
}
