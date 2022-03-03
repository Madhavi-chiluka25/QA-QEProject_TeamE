package day13;

public class MultiTest {
    public static void main(String[] args) {
       /* MultiThreading obj=new MultiThreading();
        obj.run();

        MultiThreading obj1=new MultiThreading();
        obj1.run();*/
      /*  MultiThreading obj=new MultiThreading();
        obj.start();

        MultiThreading obj1=new MultiThreading();
        obj1.start();*/
for( int i=1;i<=2;i++)
{
    MultiThreading obj=new MultiThreading(i);
    obj.start();
}
    }
}
