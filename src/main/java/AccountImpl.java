import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class AccountImpl implements Account {

    User user = new User();
    private int pin = user.getPin();


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    Scanner sc = new Scanner(System.in);

    private void createUser(){

        System.out.println(" enter firstName");
        user.setFirstName(sc.nextLine());

        System.out.println(" enter lastName");
        user.setLastName(sc.nextLine());

        System.out.println("create new pin 'ENTER PIN'");
        user.setPin(createPin());

        System.out.println(" you have successfully opened an account \n  your ACCOUNT NAME is " + user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase() + "  and your PIN is " + user.getPin() + " and your ACCOUNT NUMBER is " + user.getAccountNumber());

        enterPin();

    }

    
    @Override
    public void OpenAccount() {

        createUser();

    }

    public void enterDefaultPin(){

        System.out.println(" enter pin ");
        int p = createPin();

        if(p==2000) {
            OptionMenu.startPage();
        }else {
            enterDefaultPin();
        }
    }

    public void enterPin() {

        System.out.println(" PLEASE ENTER YOUR PIN TO PERFORM A TRANSACTION ");

        pin = sc.nextInt();

        if (pin == user.getPin() ) {
            System.out.println(" please proceed ");
            OptionMenu.startPage();

        }else if(pin != user.getPin()) {
            System.out.println(" wrong pin ");
            enterPin();

        }
    }

        public int createPin(){
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();

        return pin;

    }

    public void createSavingsAccount(){

        OpenAccount();
        System.out.println("you have successfully created a debit account");

    }

    public void createCurrentAccount(){

      OpenAccount();
        System.out.println("you have successfully created a credit account");

    }

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("select the type of account you want to open ");

        System.out.println(" for saving press 1 ");
        System.out.println("for current press 2 ");
        int b = sc.nextInt();

        if (sc.nextLine().equals("quit")) {
            OptionMenu.homePage();
        } else {
            switch (b) {

                case 1:
                    createSavingsAccount();
                    break;
                case 2:
                    createCurrentAccount();
                    break;
                default:
                    System.out.println(" please select a valid response and try again later ");
                    break;

            }

        }

    }
}

