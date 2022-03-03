package day4;

public class RetrievingPrivateData {
public static void main(String[] args)
{
    Encapsulation obj=new Encapsulation();
    System.out.println(obj.getA());
    System.out.println(obj.getS());
    obj.setA(20);
    obj.setS("changingvalue");
    System.out.println(obj.getA());
    System.out.println(obj.getS());
    }
}
