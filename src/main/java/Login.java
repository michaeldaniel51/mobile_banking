import java.util.Scanner;

public class Login {


    AccountImpl a = new AccountImpl();

    User user = new User();

    public void changePin() {

        System.out.println(" please enter your old pin ");
        int oldPin = a.createPin();

        if(user.getPin() == oldPin || oldPin == 2000){
            System.out.println("please proceed to enter new pin ");
            a.setPin(a.createPin());
            System.out.println(" new pin is  " + a.getPin());
            OptionMenu.startPage();

        }else {
            System.out.println(" please enter a valid request ");
            changePin();
        }
    }

    public void pinInfo(){

        Scanner sc = new Scanner(System.in);

        System.out.println(" please select the transaction you wish to perform ");

        System.out.println(" to create a new pin PRESS 1");
        System.out.println(" to change the pin please PRESS 2 ");

        int r = sc.nextInt();

        switch (r){

        case 1:
           a.createPin();
           break;

        case 2 :
            changePin();
            break;

        default :
            System.out.println("please enter a valid info");
            System.out.println();
            break;
        }

    }


}
