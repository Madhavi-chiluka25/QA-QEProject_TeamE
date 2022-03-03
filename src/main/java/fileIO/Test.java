package fileIO;

public class Test {
    public static void main(String[] args) {

        try {
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

    }
}
