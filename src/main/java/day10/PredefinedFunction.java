package day10;

import java.util.Locale;
import java.util.function.Function;

public class PredefinedFunction {
    public static void main(String[] args) {
        Function<String,String> function=(a)->a.toUpperCase();
        String val= function.apply("Java Predefined function in lower case");
        System.out.println(val);
    }
}
