public class LegalUser extends User{

    private String companyAddress;

    public LegalUser(String userNumber, String name, String email, float balance, String companyAddress) {
        super(userNumber, name, email, balance);
        this.companyAddress = companyAddress;
    }

    protected String getCompanyAddress(){ return companyAddress; }

    public void setCompanyAddress(String companyAddress){ this.companyAddress = companyAddress; }

    public void withdraw(float amount) {
        if (balance - amount * (1.03f) < 0)
            System.out.println("Insufficient balance");
        else{
            balance -= amount * (1.03f);
            System.out.println("Withdrawal successful");
        }
    }

    public void deposit(float amount) {
        balance += amount * (1.02f);
        System.out.println("Deposit successful");
    }

    public void showDetails() {
        System.out.println("Account Type: Legal User");
        System.out.println("User Number: " + this.getUserNumber());
        System.out.println("Company Address: " + this.getCompanyAddress());
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Balance: " + this.getBalance());
    }
}
