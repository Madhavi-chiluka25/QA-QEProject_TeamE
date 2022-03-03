package fileIO;

public class StringNull extends LogMethodClass{
    public void stringcheck()
    {
        try
        {
            String s= null;
            int i=s.length();

        }catch (Exception e)
        {
            String s1= String.valueOf(getClass());
            String s2=String.valueOf(e.getClass());
            logmethod(s1,s2);
        }
    }

    public static void main(String[] args) {
        StringNull obj=new StringNull();
        obj.stringcheck();
    }
}

