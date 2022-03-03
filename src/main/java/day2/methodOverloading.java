package day2;

public class methodOverloading {
    int a;
    String s;

    public void add(int a,int b)
    {
        int x=a+b;
        System.out.println("integer addition "+ x);
    }
    public void add(double a,double b)
    {
        double x=a+b;
        System.out.println("float addition "+ x);
    }
    public static void main(String args[]){
        methodOverloading m=new methodOverloading();
        m.add(10,20);
        m.add(10.20,20.34);
    }
}
