/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import persistance.ControllerPersistence;

/**
 *
 * @author ASUS
 */
public class TestJPA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("SE140355", "Huong", "Pham Thien", new Date("08/17/1992"));
        Student st2 = new Student("SE140356", "Hung", "Hoang Thien", new Date("08/17/1992"));
        Student st3 = new Student("SE140357", "Chinh", "Vu Thien", new Date("08/17/1992"));

        ControllerPersistence control = new ControllerPersistence();
        control.createStudent(st1);
        control.createStudent(st2);
        control.createStudent(st3);

        control.deteleStudent(st1.getId());

        st2.setFirstName("Hien");
        st2.setLastName("Pham Phuc");
        control.updateStudent(st2);
    }

}
