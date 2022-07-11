package homework;

import java.util.Scanner;

public class number1to100 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number > 0 && number <= 100) {

            System.out.println("Your number is: " + number);


        } else {

            System.out.println("Invalid Number!");

        }

    }


}
