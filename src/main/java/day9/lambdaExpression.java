package day9;

interface Truck
{
    public void driving();
}
public class lambdaExpression {
    public static void main(String[] args) {
        Truck obj=()-> System.out.println("Driving a Truck");
        obj.driving();
    }

}
