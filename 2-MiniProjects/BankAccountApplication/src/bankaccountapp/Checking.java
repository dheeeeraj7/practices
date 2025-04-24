package bankaccountapp;

public class Checking extends Account{
    //List properties specific to checking account
    int debitCardNumber;
    int debitCardPin;


    //Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    //List any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(
                        " Your Checking account features" +
                        "\n Debit Card Number: " + debitCardNumber +
                        "\n Debit Card PIN: "+ debitCardPin
        );

    }
}
