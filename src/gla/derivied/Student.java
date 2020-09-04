/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 3:32 PM
 */
package gla.derivied;

import gla.base.person.Person;

//this is a derived class from base class
public class Student extends Person {
    private int rollNo;
    private String course;
    private double cpi;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
}
