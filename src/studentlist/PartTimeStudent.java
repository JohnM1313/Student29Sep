/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Lego1
 */
public class PartTimeStudent extends Student{
    private int numOfCourses;

    public PartTimeStudent(int numOfCourses, String studentId, String studentName, String address) {
        super(studentId, studentName, address);
        this.numOfCourses = numOfCourses;
    }
    
    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
    
}
