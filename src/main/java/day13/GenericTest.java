package day13;

public class GenericTest {
    public static void main(String[] args) {

        GenericClass<Integer> i=new GenericClass<Integer>(100);
        i.printVar();
        GenericClass<String> s=new GenericClass<String>("Hello Java");
        s.printVar();
        GenericClass<Double> d=new GenericClass<Double>(232.123);
        d.printVar();

    }


}
