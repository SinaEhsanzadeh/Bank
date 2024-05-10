import java.util.ArrayList;

public class Bank {

    public static ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers(){ return Bank.users; }

    public void setUsers(ArrayList<User> users){
        Bank.users.clear();
        Bank.users.addAll(users);
    }

    public void addUser(User user){
        int i;
        for(i = 0; i < Bank.users.size(); i++){
            if (Bank.users.get(i).getUserNumber().equals(user.getUserNumber()))
                break;
        }
        if (i == Bank.users.size()){
            Bank.users.add(user);
            System.out.println("User {" + user.getUserNumber() + "} added");
        }
        else
            System.out.println("User already exists");

    }

    public void deleteUser(String userNumber){
        int i;

        for(i = 0; i < Bank.users.size(); i++)
            if(Bank.users.get(i).getUserNumber().equals(userNumber)) {
                Bank.users.remove(Bank.users.get(i));
                System.out.println("User " + userNumber + " deleted");
                break;
            }

        if(i == Bank.users.size())
            System.out.println("User doesn't exist");
    }

    public void showBankBalance(){
        float bankBalance = 0.0f;
        for(int i = 0; i < Bank.users.size(); i++)
            bankBalance += Bank.users.get(i).getBalance();

        System.out.println("Total balance of bank is: " + bankBalance);
    }


}
