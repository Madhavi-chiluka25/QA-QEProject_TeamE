package day14;
import java.util.Scanner;
public class GettingInputFromUser {

        //Declaring the int variable
        int age;

        //Declaring Scanner object
        Scanner scanner;

        public int initializeVariable() {
            //Initializing the Scanner Object
            scanner = new Scanner(System.in);

            System.out.println("Please enter the age: ");
            do {
                //Getting the Input value from the user (Initialing the age variable
                String ageString = scanner.nextLine();

                //Exception Handling
                try {
                    //Converting the String to Integer
                    age = Integer.parseInt(ageString);


                }
                catch (Exception e) {
                    System.out.println("Please enter a number for  age:");
                }
            }while((age<0)&&(age>100));
                return 0;

        }
        public static void main(String[] args) {

            GettingInputFromUser obj = new GettingInputFromUser();
            System.out.println("Your Age is :"+obj.initializeVariable());
        }
    }

