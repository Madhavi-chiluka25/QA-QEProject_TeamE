package day15;

import java.util.ArrayList;

public class ArrayListConcepts {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
    /*    for(int a: arrayList)
        {
            System.out.println(a);
        }*/
        arrayList.forEach(a-> System.out.println(a));
        //to retrieve elements
        System.out.println(arrayList.get(0));
        //to get size
        System.out.println(arrayList.size());
        //to update an element
        System.out.println(arrayList.set(2,30));
        //after update the list
        System.out.println("After updating the list: "+arrayList);
        //removing element
        System.out.println(arrayList.remove(2));
        //after removing the element, the list
        System.out.println("After removing, the list: "+arrayList);


    }
}
