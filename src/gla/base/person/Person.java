/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 3:30 PM
 */
package gla.base.person;
//this is our base class
public class Person {
    private String name;
    private String email;
    private long mobile;
    private long aadhaar;
    private String address;

    //using default constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
