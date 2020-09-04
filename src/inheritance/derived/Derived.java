/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 3:14 PM
 */
package inheritance.derived;

import inheritance.base.Base;

//this is our derived class, which inherits the functionality of base class
//this class will have all the functionality of Base class
// as well as it can have its unique functionality
public class Derived extends Base {
    public void print(){
        System.out.println("Hello from derived class");
    }
}
