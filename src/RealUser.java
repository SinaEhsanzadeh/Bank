public class RealUser extends User{

    private String id;

    public RealUser(String userNumber, String name, String email, float balance, String id) {
        super(userNumber, name, email, balance);
        this.id = id;
    }

    protected String getId(){ return id;}

    public void setId(String id){ this.id = id; }

    public void withdraw(float amount) {
        if (balance - amount * (1.05f) < 0)
            System.out.println("Insufficient balance");
        else{
            balance -= amount * (1.05f);
            System.out.println("Withdrawal successful");
        }
    }

    public void deposit(float amount) {
        balance += amount * (1.01f);
        System.out.println("Deposit successful");
    }

    public void showDetails() {
        System.out.println("Account Type: Real User");
        System.out.println("User Number: " + this.getUserNumber());
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Balance: " + this.getBalance());
    }
}
