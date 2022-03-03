package day5;

public class palindrome {
    public static void main(String[] args) {
        int n=22022022;
        int d;
        int rev=0;
        int temp=n;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;

        }
        if(temp==rev)
        {
            System.out.println("Given number is Palindrome "+rev);
        }
    }
}
