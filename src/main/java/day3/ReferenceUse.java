package day3;

public class ReferenceUse {
    //Create a zero constructor
    ReferenceUse()
    {
        System.out.println("in Zero parameter Constructor");
    }

    //One parameter Constructor
    ReferenceUse(int a)
    {
        this();
        System.out.println("In 1 parameter constructor");
        System.out.println(a);
    }

    //two parameter Constructor
    ReferenceUse(int a, int b, int c)
    {
        this(a);
        System.out.println("In 3 parameter constructor");
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args)
    {
   ReferenceUse obj = new ReferenceUse(1, 2, 3);

    }
}
