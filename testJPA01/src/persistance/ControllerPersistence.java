/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logical.Student;
import persistance.exceptions.NonexistentEntityException;

/**
 *
 * @author ASUS
 */
public class ControllerPersistence {

    StudentJpaController studentJpaController = new StudentJpaController();

    public void createStudent(Student student) {
        try {
            studentJpaController.create(student);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deteleStudent(String id) {
        try {
            studentJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateStudent(Student student) {
        try {
            studentJpaController.edit(student);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Student> getListStudent() {
        List<Student> result = new ArrayList<Student>();
        result = studentJpaController.findStudentEntities();
        return result;
    }
    
    public Student getStudentById(String id){
        Student res = new Student();
        res = studentJpaController.findStudent(id);
        return res;
    }
}
