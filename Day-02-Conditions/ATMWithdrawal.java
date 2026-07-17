public class ATMWithdrawal {
    public static void main(String[] args) {
        
    
    int balance=7000;
    int withdrawl=5000;
    if(balance>=withdrawl)
    {
        System.out.println("withdrawl success");
        balance=balance-withdrawl;
        System.out.println("balance = " + balance);
    }
    else
    {
        System.out.println("invalid");
    }

}
    
}
