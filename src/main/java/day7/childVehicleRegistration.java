package day7;

import java.sql.SQLOutput;

public class childVehicleRegistration implements vehicle,fourwheeler {


    public void registration() {
        System.out.println("fourwheeler registration");

    }


    public void driving() {
        System.out.println("vehicle driving");

    }

    public static void main(String[] args) {
       childVehicleRegistration obj=new childVehicleRegistration();
             obj.driving();
        obj.registration();
    }
}
