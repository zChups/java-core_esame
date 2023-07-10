package gmichelini.exercises.basic.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {
    String IBAN;
    double balance;
    double interestRate;
    double operationFee;

    public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.interestRate = interestRate;
        this.operationFee = operationFee;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(double operationFee) {
        this.operationFee = operationFee;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
    public void applyFee(){
        balance -= operationFee;
    }
    protected void checkIban(String iban){
        int ibanLen = iban.length();
        if (ibanLen < 8 || ibanLen > 34){
            throw (new IllegalArgumentException("Invalid iban"));
        }
        String countryCode = iban.substring(0,2);
        if (!(Character.isUpperCase(countryCode.charAt(0)) && Character.isUpperCase(countryCode.charAt(1)))){
            throw new IllegalArgumentException("Invalid country code");
        }
    }

    public double withdraw(double amount){
        balance -= amount;
        return amount;
    }
    public double transfer (BankAccount bankAccount, double amount){
        withdraw(amount);
        bankAccount.deposit(amount);
        return amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}
