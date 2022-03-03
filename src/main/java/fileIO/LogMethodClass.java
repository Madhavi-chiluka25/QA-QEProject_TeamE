package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogMethodClass {
    public void logmethod(String s1,String s2)
    {
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src/main/resources/ErrorLogFile.txt",true));
            bufferedWriter.write(s1+"\n"+s2+"\n\n");
            bufferedWriter.close();
        } catch (Exception e) {

            e.getMessage();
        }
    }
}
