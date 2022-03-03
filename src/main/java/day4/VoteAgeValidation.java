package day4;

public class VoteAgeValidation {
    public static void main(String[] args)
    {
        int age=25;
        if(age>=18)
        {
            System.out.println("Eligible to Vote & your age is " +age);
        }
        else
        {
            System.out.println(" Not Eligible to Vote & your age is " +age);
        }
    }
}
