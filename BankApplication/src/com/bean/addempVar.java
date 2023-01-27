
package com.bean;

/*      *****************************
        * @author : Devesh Patil    *
        *****************************      */

public class addempVar {
    private  String name;    
    private  String username;    
    private  String password;    
    private  String position;    
    private  String address;    
    private  String dob;    
    private  String gender;    
    private  int Salary;    
    private  int phone;    

    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getposition() {
        return getPosition();
    }

    public void setposition(String position) {
        this.setPosition(position);
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return Salary;
    }
    
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    public String getPosition() {
        return position;
    }
   
    public void setPosition(String position) {
        this.position = position;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
