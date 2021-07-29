/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;
/**
 *
 * @author Medani Gunathilaka
 */
public class Student {
    private int id;
    private String name;
    private int regNo;
    private String mobileNo;
    private String address;
    private String email;

    public Student(int id, String name, int regNo, String mobileNo, String address, String email) {
        this.id = id;
        this.name = name;
        this.regNo = regNo;
        this.mobileNo = mobileNo;
        this.address = address;
        this.email = email;
    }

  
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the regNo
     */
    public int getRegNo() {
        return regNo;
    }

    /**
     * @return the mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    
}
