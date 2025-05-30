package bankaccountapp;

public class Savings extends Account {
    //List properties specific to savings account
    double safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to initialize settings for savings properties
    public Savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,3));
    }

    //List any methods specific to the savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                        " Your savings account features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: "+safetyDepositBoxKey
                        );

    }
}
