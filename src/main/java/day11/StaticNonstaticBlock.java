package day11;

public class StaticNonstaticBlock {
int a=1;
static int b=2;
    StaticNonstaticBlock()
    {

        System.out.println(" In constructor ");
    }

   static
   {
       System.out.println("In static block ");
       System.out.println("b value "+b);
       b=20;
   }
   //Nonstatic Block
   {
       System.out.println(" In Non static Block");
       System.out.println("a value "+a);
       a=10;
   }
   //another nonstatic Block
   {
       System.out.println("in another nonstatic block a value before changing "+a);
       a=50;
   }

    public static void main(String[] args) {
        StaticNonstaticBlock obj=new StaticNonstaticBlock();
        System.out.println("a value "+obj.a);
        System.out.println("b value "+b);
    }
    }

