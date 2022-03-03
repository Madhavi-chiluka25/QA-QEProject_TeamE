package day9;

interface plus
{
    public int add(int a, int b);
}
public class Addition {
    public static void main(String[] args) {
       //for single line of code in function
        //plus obj=(a,b)->a+b;

        //for multiple lines of code in lambda function
        plus obj=(a,b)->{
            System.out.println("first number is "+a);
            System.out.println("first number is "+b);
            return a+b;
        };

      /*  int c=obj.add(11,22);
        System.out.println("Addition is "+c);*/

        System.out.println("Addition is "+obj.add(10,20));

    }
}
