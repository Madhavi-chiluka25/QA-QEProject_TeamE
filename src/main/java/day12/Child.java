package day12;

public class Child extends Parent{
    public void behavior()
    {
        System.out.println("Child behavior");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.behavior();
    }
}
