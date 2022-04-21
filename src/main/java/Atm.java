import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {


    public static void main(String[] args) {

            try {
                OptionMenu.homePage();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());

            } finally {

                Scanner g = new Scanner(System.in);
                System.out.println("please leave us a message");
                String b = g.nextLine();
                System.out.println(b);
                System.out.println("thanks for banking with us,enter a valid request next time and try again later");

            }
            OptionMenu.homePage();
        }


    }

