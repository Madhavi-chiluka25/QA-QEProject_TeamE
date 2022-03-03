package day14;

public class ExceptionHandling {
    public static void main(String[] args) {
        //String val="hello";
        String val="1qq";
        try {
            int n = Integer.parseInt(val);
            System.out.println(n);
            System.out.println("Try block executed succesfully");
        }
        catch(NumberFormatException e) {
            System.out.println(("Please enter valid input"));
        }
        System.out.println("end of program");
    }
}
