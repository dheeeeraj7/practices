package bankaccountapp;

import java.io.FileNotFoundException;
import java.util.List;

public class BankAccApp {
    public static void main(String[] args) {
        String file = "C:\\Users\\Admin\\Desktop\\NewBankAccounts";
        /*Checking chkacc1 = new Checking("Dheeraj", "883114118211", 1500);

        Savings s = new Savings("Nikhil","45124785652", 2000);

        chkacc1.showInfo();
        System.out.println("-----------------------------");
        s.showInfo();

        s.compound();*/


        //Read a CSV file then create new accounts based on that data.
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolder){
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }


}
