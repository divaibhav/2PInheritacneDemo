/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 3:18 PM
 */
package inheritance.main;

import inheritance.derived.Derived;

public class Main {
    public static void main(String[] args) {
        //we are going to access functionality of Base class from Derived object
        Derived object = new Derived();

        //calling derived class method print
        object.print();
        // calling the methods of base class from derived object
        object.display();
        object.greet();
    }
}
