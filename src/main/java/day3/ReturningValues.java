package day3;

public class ReturningValues {
    public void notReturning()
    {
        System.out.println("Not returning");
    }
    public String concat(String a, String b)
    {
        return a+b;
    }

    public static void main(String[] args) {

        ReturningValues obj = new ReturningValues();
        obj.notReturning();
        String c = obj.concat("Lion","Tiger");

        System.out.println(c);

    }
}
