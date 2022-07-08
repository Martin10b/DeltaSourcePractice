
import java.util. Scanner;
    public class DaysOfTheWeek{
        public static void main(String[] args) {
            Scanner SC = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Number is out of the 1-7 range.");
            }
        }
    }





