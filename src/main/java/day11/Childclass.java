package day11;

public class Childclass extends parentclass{
    int b=20;
    Childclass()
    {
        super();
        System.out.println("child class constructor");
    }
    public void childclassmethod()
    {
        super.parentmethod();
        System.out.println("child class method b value "+b);
        System.out.println("parent variable a value "+super.a);
    }

    public static void main(String[] args) {
        Childclass obj=new Childclass();
        obj.childclassmethod();
    }
}
