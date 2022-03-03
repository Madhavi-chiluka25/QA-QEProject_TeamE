package day9;

@FunctionalInterface
interface concat
{
    public String Sconcat(String s1,String s2);
}
public class StringConcatination {
    public static void main(String[] args) {
        concat obj=(s1, s2) -> {
            System.out.println("first name is "+s1);
            System.out.println("last name is "+s2);
            return s1+" "+s2;
        };
        System.out.println("String Concatination "+obj.Sconcat("Madhavi","Chiluka"));
    }
}
