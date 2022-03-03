package fileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class InsertingIntoExcel {
    public static void main(String[] args) throws FilloException {
        Fillo fillo=new Fillo();
        Connection connection= null;
        try {
            connection = fillo.getConnection("src/main/resources/ExcelHandling.xlsx");
        } catch (FilloException e) {
            e.printStackTrace();
        }
        String strQuery="INSERT INTO sheet1(TestCase,Result) VALUES('TC004','Pass')";

        connection.executeUpdate(strQuery);

        connection.close();
    }
}
