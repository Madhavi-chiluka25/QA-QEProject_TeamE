package fileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadingExcel {
    public static void main(String[] args) throws FilloException {


        Fillo fillo = new Fillo();
        Connection connection = null;
        try {
            connection = fillo.getConnection("src/main/resources/ExcelHandling.xlsx");
        } catch (FilloException e) {
            e.printStackTrace();
        }
        String strQuery = "Select * from Sheet1 ";
        Recordset recordset = null;
        try {
            recordset = connection.executeQuery(strQuery);
        } catch (FilloException e) {
            e.printStackTrace();
        }

        while (recordset.next()) {
            System.out.println(recordset.getField("TestCase"));
            System.out.println(recordset.getField("Result"));
        }

        recordset.close();
        connection.close();
    }
}
