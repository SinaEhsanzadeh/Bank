public abstract class User {

    protected String userNumber;
    protected String name;
    protected String email;
    protected float balance;

    public User(String userNumber, String name, String email, float balance){
        this.userNumber = userNumber;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    protected String getUserNumber(){ return userNumber; }
    protected String getName(){ return name; }
    protected String getEmail(){ return email; }
    protected float getBalance(){ return balance; }

    public abstract void showDetails();
    public abstract void withdraw(float amount);
    public abstract void deposit(float amount);

}
