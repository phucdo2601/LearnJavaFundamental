/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import java.util.ArrayList;
import java.util.List;
import persistance.ControllerPersistence;

/**
 *
 * @author ASUS
 */
public class TestLoadStudent {

    public static void main(String[] args) {
        ControllerPersistence control = new ControllerPersistence();
        List<Student> listRes = new ArrayList<Student>();
        listRes = control.getListStudent();
        System.out.println("Load list student:");
        for (Student listRe : listRes) {
            System.out.println(listRe.toString());
        }
        String studentId = "SE140354";
        System.out.println("Load Student by id "+studentId);
        Student res = new Student();
        res = control.getStudentById(studentId);
        System.out.println(res.toString());
    }
}
