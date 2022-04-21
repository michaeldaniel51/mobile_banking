import java.util.UUID;

public class User {


    private String accountNumber;
    private String firstName;
    private String lastName;
    private int pin;


    public User() {
    }

    public User(String accountNumber, String firstName, String lastName, int pin) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return generateAccountNumber();
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int pin(User password){
        return pin = password.getPin();
    }

    @Override
    public String toString() {
        return "User{" +
                "accountNumber='" + accountNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pin=" + pin +
                '}';
    }

    public static String generateAccountNumber(){

        String d = "000";
       String p = String.valueOf(UUID.randomUUID().hashCode());
        String c = d+p;
       return c.replace("-","");


    }



}
