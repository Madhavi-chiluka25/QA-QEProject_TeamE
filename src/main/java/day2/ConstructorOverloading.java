package day2;

public class ConstructorOverloading {
    //Zero Constructor
    ConstructorOverloading() {
        System.out.println("Zero Constructor");
    }

    //One Parameter Constructor
    ConstructorOverloading(int a) {
        System.out.println(a);
    }


    //Two Parameter Constructor
    ConstructorOverloading(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
    ConstructorOverloading(String a,String b){
        System.out.println("first name "+a +" Last name "+b);

    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(20, 30);
        ConstructorOverloading obj4=new ConstructorOverloading("QA","QE");

    }
}
