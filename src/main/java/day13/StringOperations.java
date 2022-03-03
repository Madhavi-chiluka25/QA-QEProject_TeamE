package day13;

public class StringOperations {
    public static void main(String[] args) {
        String val="  This is Java string Operations class   ";
        String val2="Automation";
        //to find length of the string
        System.out.println(val.length());
        //to remove spaces at the begining and end
        System.out.println(val.trim());
        //to convert to uppercase
        System.out.println(val.toUpperCase());
        System.out.println(val.toLowerCase());
        //to print sunstring
        System.out.println(val.substring(0,15));

        //replace a string

        System.out.println(val.replace("Java","Testing"));

        //to check string is there
        System.out.println(val.contains("class"));

        //to check position
        System.out.println(val.lastIndexOf("J"));

        //to check its empty?
        System.out.println(val.isEmpty());

        //Concatination
        System.out.println(val.concat(val2));

    }
}
