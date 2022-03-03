package fileIO;

import java.util.Scanner;

public class AcceptingInput extends LogMethodClass{
    int age;
    Scanner scanner;
    public int initializeVariable() {

        do {
            System.out.println("enter age of voter");
            try {
                scanner = new Scanner(System.in);

                age = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                String s1=String.valueOf(getClass());
                String s2=String.valueOf(e.getClass());
                logmethod(s1,s2);
                System.out.println("Please Enter age in Number ");
            }
        } while ((age <= 0) || (age > 100));
        return age;
    }
    public static void main(String[] args) {

        AcceptingInput obj=new AcceptingInput();
        int validage=obj.initializeVariable();
        if(validage<18)
        {
            System.out.println("Not Eligible for vote! Your Age is: "+validage);
        }
        else
        {
            System.out.println("Congratulations! You are eligible to Vote ");
        }

    }
}
