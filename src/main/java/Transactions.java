import java.util.Scanner;

public class Transactions extends AccountImpl{


    private int balance ;

    Scanner sc =new Scanner(System.in);

    public void checkBalance(){

        if(balance >= 0){
            System.out.println("your remaining balance is " + balance);
        }


    }

    public void debitTransaction(){
        System.out.println("please enter the amount you wish to debit your acct with ");
        int amount = sc.nextInt();

        if(balance< amount){
            System.out.println("you do not have sufficient funds ,would you like to credit your account?");

            Scanner c = new Scanner(System.in);

            System.out.println("would you like to credit your account now \n " +  " ENTER yes or no");
            String d = c.nextLine();
            if ("yes".equals(d)) {
                creditTransaction();
            }else if ("no".equals(d)){
                System.out.println("please credit your account and try again later");
                OptionMenu.newPage();
            }

        }
       else {
            balance -= amount;

            System.out.println("your acct has been debited with " + amount + " and your balance is " + balance);
        }
        processTransaction();

    }

    public void creditTransaction(){

        System.out.println("please enter the amount you wish to credit your acct with ");
        int amount= sc.nextInt();
        balance += amount;

        System.out.println("your acct has been credited with " + amount + " and your balance is " + balance );

      processTransaction();
    }


    public void processTransaction(){

        System.out.println(" do you want to perform another transaction?? ");

        System.out.println(" to make a withdrawal enter 1 ");
        System.out.println(" to check your balance 2");
        System.out.println(" to exit enter 3 ");


        int v = sc.nextInt();

        switch (v){

            case 1:
                debitTransaction();
                break;
            case 2:
                checkBalance();
                break;
            case 3:
                OptionMenu.newPage();
            break;
            default:
                System.out.println("please enter a valid request ");
                break;
        }


    }




}
