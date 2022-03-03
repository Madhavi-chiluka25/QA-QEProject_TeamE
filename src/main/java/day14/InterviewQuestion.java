package day14;

public class InterviewQuestion {

        public static int getValue()
        {
            try
            {
                return 4;
            }
            catch(Exception e)
            {
                return 5;
            }
            finally {
                return 6;

        }

    }

    public static void main(String[] args) {
        System.out.println(getValue());
    }
}
