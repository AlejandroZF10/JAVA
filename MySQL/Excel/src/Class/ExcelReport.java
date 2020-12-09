package Class;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReport {
    
    public static void createExcel97(){
        Workbook book = new HSSFWorkbook();
        Sheet sheet0 = book.createSheet("Hoja 1");        
        try{
            FileOutputStream fos = new FileOutputStream("Excel.xls");
            book.write(fos);
            fos.close();
        }catch(IOException except){
            System.err.println(except.toString());
        }
    }
    
    public static void createExcel07(){
        Workbook book = new XSSFWorkbook();
        Sheet sheet0 = book.createSheet("Hoja 1");
        Row row0 = sheet0.createRow(0);
        row0.createCell(0).setCellValue("HOLA JAVA");
        row0.createCell(1).setCellValue(7.5);
        row0.createCell(2).setCellValue(true);
        
        Cell cell = row0.createCell(3);
        cell.setCellFormula(String.format("7+5",""));
        
        Row row1 = sheet0.createRow(1);
        row1.createCell(0).setCellValue(4.5);
        row1.createCell(1).setCellValue(15.5);
        row1.createCell(3).setCellFormula(String.format("A2+B2",""));
        
        Row row2 = sheet0.createRow(1);
        row2.createCell(0).setCellValue(4.5);
        row2.createCell(1).setCellValue(15.5);
        row2.createCell(3).setCellFormula(String.format("A%d+B%d",3,3));
        try{
            FileOutputStream fos = new FileOutputStream("Excel.xlsx");
            book.write(fos);
            fos.close();
        }catch(IOException except){
            System.err.println(except.toString());
        }
    }
    
    public static void main(String[] args) {
        createExcel07();
    }
    
}