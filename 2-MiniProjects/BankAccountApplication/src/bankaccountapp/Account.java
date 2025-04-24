package bankaccountapp;

public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
    String name;
    String SSN;
    double balance;
    static int index  = 10000;
    String accountNumber;
    double rate;

    //constructors to set base properties and initialize the account
    public Account( String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = SSN.substring(SSN.length()-2,SSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest + "\nAvailable Balance: "+balance);
    }

    //List common methods
    public void deoposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited: "+amount +
                "\nAvailable Balance: "+ balance);
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawn: "+amount +
                "\nAvailable Balance: "+balance);
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfer $"+amount+ " to "+ toWhere+
                "\nAvailable Balance: "+balance);
    }
    public void showInfo(){
        System.out.println(
                        "NAME: "+ name+
                        "\nACCOUNT NUMBER: "+ accountNumber+
                        "\nBALANCE: "+ balance+
                        "\nRATE: "+ rate + "%"
        );
    }
}
