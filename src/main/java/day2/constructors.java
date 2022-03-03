package day2;

public class constructors {
    int a,b;
    constructors(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    constructors(){
        System.out.println("hello in Default constructor");
    }
    public static void main(String args[]){
        constructors c=new constructors(10,20);
        constructors c1=new constructors();
        System.out.println(c.a);
        System.out.println(c.b);
    }
}
