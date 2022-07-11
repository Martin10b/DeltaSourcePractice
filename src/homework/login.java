package homework;
import java.util.Scanner;
public class login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");

        String name = scan.nextLine();

        System.out.print("Enter password: ");

        String pass = scan.nextLine();

        String nametrue = "Martin10b";

        String passtrue = "STILKATAeSHOPAR";


        while (name.equals(nametrue) == false) {


            System.out.print("Enter name again: ");

            name = scan.nextLine();

            System.out.print("Enter password: ");

            pass = scan.nextLine();

        }


        while (name.equals(nametrue) && pass.equals(passtrue)) {


            System.out.print("Welcome " + nametrue + "!");

            break;

        }


    }
}