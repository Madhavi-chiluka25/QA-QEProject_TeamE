package day8;

public class TestAbstraction {
    public static void main(String[] args)
    {
        RateOfInterest r=new BOFA();
        r.interestRate();
        RateOfInterest r1=new Chase();
        r1.interestRate();
        RateOfInterest r2=new DCU();
        r2.interestRate();
        RateOfInterest r3=new WellsFargo();
        r3.interestRate();


    }
}
