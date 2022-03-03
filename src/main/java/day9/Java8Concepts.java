package day9;

import java.net.SocketTimeoutException;
//functional interface concept
@FunctionalInterface
interface Car
{
    public void driving();


}

public class Java8Concepts implements Car{


    public void driving() {
        System.out.println("Driving a car");
    }

    public static void main(String[] args) {
        Car obj=new Java8Concepts();
        obj.driving();
    }
}
