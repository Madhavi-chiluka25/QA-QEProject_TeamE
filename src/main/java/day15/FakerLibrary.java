package day15;

import com.github.javafaker.Faker;

public class FakerLibrary {
    public static void main(String[] args) {
        //Java Faker -Gives the real time fake data
        Faker faker=new Faker();
        for(int i=0;i<=5;i++) {
            System.out.println(faker.name().firstName());
            System.out.println(faker.name().lastName());
            System.out.println(faker.name().fullName());
            System.out.println(faker.address().fullAddress());
            System.out.println(faker.address().city());
            System.out.println(faker.business().creditCardNumber());
        }
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.phoneNumber());
        System.out.println(faker.idNumber().ssnValid());
        System.out.println(faker.company());
    }
}
