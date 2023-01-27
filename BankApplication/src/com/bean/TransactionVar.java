
package com.bean;

/*
    * @author : Devesh Patil
*/

public class TransactionVar {
    
    private int AccountNum;
    private String Password;
    private String Name;
    private int Phone;
    private int Amount;
    private int AvailabelBal;
    
    public int getAccountNum() {
        return AccountNum;
    }
    public void setAccountNum(int AccountNum) {
        this.AccountNum = AccountNum;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAvailabelBal() {
        return AvailabelBal;
    }
    public void setAvailabelBal(int AvailabelBal) {
        this.AvailabelBal = AvailabelBal;
    }

    public int getAmount() {
        return Amount;
    }
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getPhone() {
        return Phone;
    }
    public void setPhone(int Phone) {
        this.Phone = Phone;
    }
}
