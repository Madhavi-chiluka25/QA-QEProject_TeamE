package day10;

import java.util.function.Predicate;

public class PredicateVoter {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (age) ->age>=18;

        boolean b = predicate.test(29);
        if (b == true) {
            System.out.println("valid voter");
        } else {
            System.out.println("not valid voter");
        }
    }
}




