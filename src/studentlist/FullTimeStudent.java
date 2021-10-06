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
public class FullTimeStudent extends Student{
    private int numSemesters;

    public FullTimeStudent(int numSemesters, String studentId, String studentName, String address) {
        super(studentId, studentName, address);
        this.numSemesters = numSemesters;
    }

    public int getNumSemesters() {
        return numSemesters;
    }

    public void setNumSemesters(int numSemesters) {
        this.numSemesters = numSemesters;
    }
    
}
