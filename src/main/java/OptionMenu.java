import java.util.Scanner;

public class OptionMenu {



    public static void homePage() {


        System.out.println(" WOULD YOU LIKE TO OPEN AN ACCOUNT WITH US NOW?? ");

        System.out.println();
        System.out.println(" enter  (yes) to open");
        System.out.println(" enter (no) if you already have an account!!!");
        Scanner sc = new Scanner(System.in);

        String answer = sc.nextLine();

        if (answer.equals("quit")) {
            homePage();
        }

            switch (answer) {
                case "yes":
                    start();
                    break;
                case "no":
                    newPage();
                    break;
                default:
                    System.out.println("please enter a valid answer and try again!!!!! ");
                    homePage();
                    break;


            }


        }


    public static void start(){

        AccountImpl a = new AccountImpl();
        a.createAccount();

    }


    public static void newPage() {

        Login login = new Login();
        AccountImpl a = new AccountImpl();
        System.out.println("Thanks for using our atm ");
        a.enterDefaultPin();
        System.out.println();
        System.out.println("Enter the type of transaction you want to perform ");
        System.out.println("To credit your account enter 1");
        System.out.println("For withdrawal enter 2");
        System.out.println("To check your balance enter 3");
        System.out.println("To change your pin enter 4");


        Scanner amt = new Scanner(System.in);

        Transactions t = new Transactions();

        int info = amt.nextInt();

        if (amt.nextLine().equals("quit")) {
            homePage();
        } else {
            switch (info) {


                case 1:
                    t.creditTransaction();
                    break;
                case 2:
                    t.debitTransaction();
                    break;
                case 3:
                    t.checkBalance();
                    break;
                case 4:
                    login.pinInfo();
                    break;
                default:
                    System.out.println("please select an option and try again later ");
                    startPage();
                    break;

            }


        }
    }


    public static void startPage(){
        Login login = new Login();
        AccountImpl a = new AccountImpl();
        System.out.println(" thanks for using our atm ");

        System.out.println("enter the type of transaction you want to perform ");

        System.out.println();System.out.println();


        System.out.println("to credit your account enter 1");
        System.out.println("for withdrawal enter 2");
        System.out.println(" to check your balance enter 3");
        System.out.println("to change your pin enter 4");


        Scanner amt = new Scanner(System.in);

        Transactions t = new Transactions();

        int info = amt.nextInt();

        switch (info){

            case 1:
                t.creditTransaction();
                break;
            case 2:
                t.debitTransaction();
                break;
            case 3:
                t.checkBalance();
                break;
            case 4:
                login.pinInfo();
                break;
            default:
                System.out.println("please select an option and try again later ");
                startPage();
                break;

        }


    }


}






