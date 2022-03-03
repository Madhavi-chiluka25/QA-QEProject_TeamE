package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling extends LogMethodClass {
   public void writeToFile(String s)
   {
        //Writing to Existing file
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src/main/resources/ErrorLogFile.txt",true));
            bufferedWriter.append("\nHello am writing to a file: "+s);
           // bufferedWriter.append("\n next line sentences");
            bufferedWriter.close();
        } catch (Exception e) {
           // e.printStackTrace();
            String s1=String.valueOf(getClass());
            String s2=String.valueOf(e.getClass());
            logmethod(s1,s2);

        }
    }

    public static void main(String[] args) {

      /*  try {
            String s = null;
            System.out.println(s.charAt(0));
        } catch (Exception e) {
            fileHandling obj = new fileHandling();
            obj.writeToFile(e.getMessage());
        }
        int a = 10;
        int b = 0;
        try
        {
            int c = a / b;
            System.out.println("c");
        }catch (Exception e) {
            fileHandling obj = new fileHandling();
            obj.writeToFile(e.getMessage());
        }
*/
    }
}
