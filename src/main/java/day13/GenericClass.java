package day13;

public class GenericClass<T>{
    T var;
    GenericClass(T var)
    {

        this.var=var;
    }
    public void printVar()
    {
        System.out.println(var);
    }

}
