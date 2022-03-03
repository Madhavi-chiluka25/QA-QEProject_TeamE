package day15;

public class Arrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        int size=arr.length;
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(arr[i]);
        }
        //java 8
        for (int a:arr)
        {
            System.out.println(a);
        }
    }
}
