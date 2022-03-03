package day10;

import java.util.function.Predicate;

public class PredefinedPredicate {
    public static void main(String[] args) {
       // Predicate<String> predicate=(a)->a.length()>10;
        Predicate<Integer> predicate=(a)->a.equals(10);
        //System.out.println(predicate.test("madhavi"));
        System.out.println(predicate.test(20));
    }
}
