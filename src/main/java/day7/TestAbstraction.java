package day7;

public class TestAbstraction {
    public static void main(String[] args) {

        Shape s = new Circle();
        s.drawing();
        Shape s1=new Rectangle();
        s1.drawing();
    }
}
