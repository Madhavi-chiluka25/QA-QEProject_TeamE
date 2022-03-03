package day5;

public class patternABB {
    public static void main(String[] args)
    {
        String  x;
        for( int i=1;i<=5;i++)
         {
             for (int j = 1; j <= i; j++)
             {
           /*      if(i==1) { x="A";System.out.print(x);}
                 if(i==2) { x="B";System.out.print(x);}
                 if(i==3){ x="C";System.out.print(x);}
                 if(i==4){x="D";System.out.print(x);}
                 if(i==5){x="E";System.out.print(x);}*/
                 System.out.print((char)(64+i));
             }
             System.out.println();
         }
        }
    }

