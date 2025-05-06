/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
public class CheckingAccount {
    private String accountNumber;
    private String name;
    private double balance;
    
    public CheckingAccount(String number, String nam, double balance){
        accountNumber = number;
        name = name;
        this.balance= balance;
    }
    
    public double getBalance(){
        return balance;
    }
    public void deposit (double balnc){
        balance +=balnc;
    }
    public void processCheck(double check){
        if(balance < 1000){
            balance -=2.5;
            balance -=check;
        }
    }
}
