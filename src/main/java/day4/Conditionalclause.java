package day4;

public class Conditionalclause {
    public static void main(String[] args)
    {
        int p=234;
        int q=123;
        int r=678;
        if (p>q)
        {
            if(q>r)
            {
                if(r>p)
                {
                    System.out.println("Access Granted");
                }
                else
                {
                    System.out.println("Access Denied");
                }

            }
            else
            {
                System.out.println("Access Denied");
            }
        }
        else
        {
            System.out.println("Access Denied");
        }
    }
}
