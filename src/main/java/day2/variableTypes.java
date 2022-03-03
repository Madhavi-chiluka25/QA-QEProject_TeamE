package day2;

public class variableTypes {
    static int a;
    String s;
    float f;
    //local method inside a class
    public void method(){
        int a=2;
        String b="hello";
        System.out.println("a and b values inside method " + a+" and "+b);

    }
    public static void method2(){
        int a=20;
        String b="hello";
        System.out.println("a and b values inside static method " + a+" and "+b);

    }
    public static void main(String[] args){
        day2.variableTypes v=new day2.variableTypes();
        System.out.println("variables at class");
        //static variable can be called without object
        System.out.println(a);
        System.out.println(v.s);
        System.out.println(v.f);
        v.method();
        //static method can be called without object
        method2();
    }

}

