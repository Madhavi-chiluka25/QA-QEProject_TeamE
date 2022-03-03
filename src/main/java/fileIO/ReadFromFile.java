package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFromFile extends LogMethodClass{
    public void ReadingFile()
    {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/FileRead_Write.txt"));
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);

            }
            bufferedReader.close();
        } catch (Exception e) {
            String s1=String.valueOf(getClass());
            String s2=String.valueOf(e.getClass());
            logmethod(s1,s2);

        }
    }
    public static void main(String[] args) {
ReadFromFile obj=new ReadFromFile();
obj.ReadingFile();


    }
}

