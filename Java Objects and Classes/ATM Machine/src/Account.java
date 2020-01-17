import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){

    }

    public Account(int id, int balance){
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthlyInterestRate = (annualInterestRate / 12.0) / 100.0;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest(){
       double monthlyInterest = balance * getMonthlyInterestRate();
       return monthlyInterest;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
}
