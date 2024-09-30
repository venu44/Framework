package Tdd.Framework;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataProviderCode {
    @DataProvider(name = "testData")
    public static Object[][] getData() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Suresh_Automation\\Framework\\Resources\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0); // use sheet index 0 as default
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
        int columnCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);
                data[i][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
}
