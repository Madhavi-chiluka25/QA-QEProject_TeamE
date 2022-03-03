package day4;

public class BiggestOfThreeSet {
    public static void main(String[] args)
    {
        ThreeNumSet obj=new ThreeNumSet();
        obj.setA(267);
        obj.setB(4126);
        obj.setC(1325);
       int greatestnum=obj.greaterMethod();
       System.out.println("greatest of three numbers is" +greatestnum);
    }
}
