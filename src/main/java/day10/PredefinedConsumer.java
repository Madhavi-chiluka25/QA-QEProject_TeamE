package day10;

import java.sql.SQLOutput;
import java.util.function.Consumer;

public class PredefinedConsumer {
    public static void main(String[] args) {
        Consumer<String> c=(a)-> System.out.println(a);
        c.accept("Consumer class accepting values");
    }
}
