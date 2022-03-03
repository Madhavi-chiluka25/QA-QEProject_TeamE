package day3;

public class ReferenceUseMethod {
    public void method1()
    {
        System.out.println("No parameter method");
    }

    public void method1(int a)
    {
        this.method1();
        System.out.println("one parameter method");
        System.out.println(a);

    }

    public static void main(String[] args) {

        ReferenceUseMethod obj = new ReferenceUseMethod();
        obj.method1(10);

    }
}
