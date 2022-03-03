package day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArthematicException {
    public static void main(String[] args)  {
        int a = 10;
        int b = 0;


        try
        {
            int c = a / b;
            System.out.println("c");
        }
        catch (Exception e)
        {

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/ErrorLogFile.txt"));
                bufferedWriter.append(e.getMessage()+" from Arthematic division program\n");
                bufferedWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            System.out.println("b should not be 0");
        }
        finally {
            System.out.println("finally block");
        }
    }
}