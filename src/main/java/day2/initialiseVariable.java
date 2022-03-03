package day2;

public class initialiseVariable {

        //Instance Variable - hard coding
        int a;
        String b;

        //Creating the Parametrized Constructor
    /*initialiseVariable(int a, String b)
    {
        this.a = a;
        this.b = b;
    }*/

        //Creating Zero or Non-Parametrized Constructor
        initialiseVariable()
        {
            System.out.println("Zero Constructor");
        }
   public static void main(String[] args) {

           initialiseVariable obj = new initialiseVariable();
            System.out.println(obj.a);
            System.out.println(obj.b);
        }
    }

