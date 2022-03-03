package fileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class UpdatingExcel {
    public static void main(String[] args) {
        Fillo fillo=new Fillo();
        Connection connection= null;
        try {
            connection = fillo.getConnection("src/main/resources/ExcelHandling.xlsx");
        } catch (FilloException e) {
            e.printStackTrace();
        }
        String strQuery="Update Sheet1 Set Result='ERROR' where TestCase='TC001'";

        try {
            connection.executeUpdate(strQuery);
        } catch (FilloException e) {
            e.printStackTrace();
        }

        connection.close();
    }
}
