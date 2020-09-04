/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 3:36 PM
 */
package gla.main;

import gla.derivied.Student;

//execution class
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(student.getRollNo());

        student.setName("vaibhav");
        student.setEmail("di@gmail.com");
        student.setRollNo(11);

        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(student.getRollNo());

    }
}
