import java.text.DecimalFormat;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = USD * 1.79549 ;

        System.out.println(df.format(BGN) + " BGN");
    }
}


