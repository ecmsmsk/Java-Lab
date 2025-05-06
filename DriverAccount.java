/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */


public class DriverAccount {
    public static void main (String [] args){
        CheckingAccount ca = new CheckingAccount("1212ec","ecem",999);
       
        System.out.println("current balance: "+ ca.getBalance());
        System.out.println("after deposit: "+ ca.getBalance());
        ca.deposit(159);
        System.out.println("balance: "+ca.getBalance());
    }
    
}
