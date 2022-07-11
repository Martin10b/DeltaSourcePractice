package homework;
import java.util.Scanner;

    public class bodyWeight {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter weight: ");

            int weight = scan.nextInt();

            if (weight<50){

                System.out.print("You are Anorexic ");

            }

            if (weight >= 50 && weight <= 70){

                System.out.print("You are Skinny ");

            }

            if  (weight >= 71 && weight <= 90){

                System.out.print("you are Skinny fat ");

            }

            if (weight > 90 && weight <= 110){

                System.out.print("You are Obese ");

            }

            if (weight >= 111 ){

                System.out.print("You are Extremely obese ");

            }

        }
    }
