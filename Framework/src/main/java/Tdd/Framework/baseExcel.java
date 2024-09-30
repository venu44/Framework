package Tdd.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class baseExcel {
    private File file;
    private FileInputStream inputStream;
    private Workbook workbook;
    private Sheet sheet;

    public baseExcel(String filePath) throws IOException {
        file = new File(filePath);
        inputStream = new FileInputStream(file);
        workbook = WorkbookFactory.create(inputStream);
        sheet = workbook.getSheetAt(0); // get the first sheet
    }

    public String getCellValue(int rowIndex, int columnIndex) {
        String cellValue = "";
        if (sheet.getRow(rowIndex) == null) {
            System.out.println("Row " + rowIndex + " is null");
            return cellValue;
        }
        Cell cell = sheet.getRow(rowIndex).getCell(columnIndex);
        if (cell == null) {
            System.out.println("Cell " + rowIndex + ", " + columnIndex + " is null");
            return cellValue;
        }
        switch (cell.getCellType()) {
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            default:
                cellValue = "";
        }
        return cellValue;
    }

    public void close() throws IOException {
        workbook.close();
        inputStream.close();
    }
}