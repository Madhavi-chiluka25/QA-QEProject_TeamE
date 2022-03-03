package day12;

public class BankTest {
    public static void main(String[] args) {
        BOFA b=new BOFA();
        System.out.println(b.rateOfInterest());
        Chase c=new Chase();
        System.out.println(c.rateOfInterest());
    }
}
