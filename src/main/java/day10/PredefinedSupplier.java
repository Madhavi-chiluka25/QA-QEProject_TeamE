package day10;

import java.util.function.Supplier;

public class PredefinedSupplier {
    public static void main(String[] args) {
        Supplier<String> s=()->"Hello Java ";
        Supplier<Integer> s1=()->8;
        Supplier<String> s2=()->" Concepts Practice";
        System.out.println(s.get()+s1.get()+s2.get());
        String val= s.get();
    }
}
