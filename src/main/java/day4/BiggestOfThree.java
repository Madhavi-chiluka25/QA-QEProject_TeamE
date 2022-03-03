package day4;

public class BiggestOfThree {
    public static void main(String[] args)
    {
        ThreeNum tn=new ThreeNum();
        int a=tn.getA();
        int b=tn.getB();
        int c=tn.getC();

        if ((a>b) && (a>c))
        {
            System.out.println("Biggest is a");
        }
        if ((b>a) && (b>c))
        {
            System.out.println("Biggest is b");
        }
        if ((c>a) && (c>b))
        {
            System.out.println("Biggest is c");
        }
    }
}
